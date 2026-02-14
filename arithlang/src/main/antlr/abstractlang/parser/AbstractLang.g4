grammar AbstractLang;

program returns [abstractlang.AST.Program ast]
    : e=exp EOF { $ast = new abstractlang.AST.Program($e.ast); }
    ;

exp returns [abstractlang.AST.Exp ast]
    : ae=atomexp { $ast = $ae.ast; }
    | ad=addexp  { $ast = $ad.ast; }
    | me=multexp { $ast = $me.ast; }
    ;

atomexp returns [abstractlang.AST.Exp ast]
    : 'p' { $ast = new abstractlang.AST.AtomExp(abstractlang.AST.AbsVal.P); }
    | 'n' { $ast = new abstractlang.AST.AtomExp(abstractlang.AST.AbsVal.N); }
    | 'z' { $ast = new abstractlang.AST.AtomExp(abstractlang.AST.AbsVal.Z); }
    | 'u' { $ast = new abstractlang.AST.AtomExp(abstractlang.AST.AbsVal.U); }
    ;

addexp returns [abstractlang.AST.Exp ast]
    locals [java.util.ArrayList<abstractlang.AST.Exp> list]
    @init { $list = new java.util.ArrayList<abstractlang.AST.Exp>(); }
    : '(' '+'
          e=exp { $list.add($e.ast); }
          ( e=exp { $list.add($e.ast); } )+
      ')'
      { $ast = new abstractlang.AST.AddExp($list); }
    ;

multexp returns [abstractlang.AST.Exp ast]
    locals [java.util.ArrayList<abstractlang.AST.Exp> list]
    @init { $list = new java.util.ArrayList<abstractlang.AST.Exp>(); }
    : '(' '*'
          e=exp { $list.add($e.ast); }
          ( e=exp { $list.add($e.ast); } )+
      ')'
      { $ast = new abstractlang.AST.MultExp($list); }
    ;

WS : [ \t\r\n]+ -> skip;
