grammar AbstractLang;

program returns [Program ast]
    : e=exp EOF { $ast = new Program($e.ast); }
    ;

exp returns [Exp ast]
    : a=atomexp { $ast = $a.ast; }
    | a=addexp  { $ast = $a.ast; }
    | m=multexp { $ast = $m.ast; }
    ;

atomexp returns [AtomExp ast]
    : 'p' { $ast = new AtomExp(AbsVal.P); }
    | 'n' { $ast = new AtomExp(AbsVal.N); }
    | 'z' { $ast = new AtomExp(AbsVal.Z); }
    | 'u' { $ast = new AtomExp(AbsVal.U); }
    ;

addexp returns [AddExp ast]
    locals [java.util.ArrayList<Exp> list]
    @init { $list = new java.util.ArrayList<Exp>(); }
    : '(' '+' e=exp { $list.add($e.ast); }
          (e=exp { $list.add($e.ast); })+
      ')'
      { $ast = new AddExp($list); }
    ;

multexp returns [MultExp ast]
    locals [java.util.ArrayList<Exp> list]
    @init { $list = new java.util.ArrayList<Exp>(); }
    : '(' '*' e=exp { $list.add($e.ast); }
          (e=exp { $list.add($e.ast); })+
      ')'
      { $ast = new MultExp($list); }
    ;

WS : [ \t\r\n]+ -> skip;
