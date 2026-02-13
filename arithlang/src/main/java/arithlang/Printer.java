package arithlang;

import arithlang.AST.AddExp;
import arithlang.AST.DivExp;
import arithlang.AST.MultExp;
import arithlang.AST.NumExp;
import arithlang.AST.PowerExp;
import arithlang.AST.Program;
import arithlang.AST.SubExp;

public class Printer {
    public void print(Value v) {
        System.out.println(v.toString());
    }

    public static class Formatter implements AST.Visitor<String> {

        public String visit(Program p) {
            return (String) p.e().accept(this);
        }

        public String visit(NumExp e) {
            return e.toString();
        }

        public String visit (PowerExp e) {
            StringBuilder result = new StringBuilder("(Power");
            for (AST.Exp exp : e.all())
                result.append(" ").append(exp.accept(this));
            return result + ")";
        }

        public String visit(AddExp e) {
            StringBuilder result = new StringBuilder("(+");
            for (AST.Exp exp : e.all())
                result.append(" ").append(exp.accept(this));
            return result + ")";
        }

        public String visit(SubExp e) {
            StringBuilder result = new StringBuilder("(-");
            for (AST.Exp exp : e.all())
                result.append(" ").append(exp.accept(this));
            return result + ")";
        }

        public String visit(MultExp e) {
            StringBuilder result = new StringBuilder("(*");
            for (AST.Exp exp : e.all())
                result.append(" ").append(exp.accept(this));
            return result + ")";
        }

        public String visit(DivExp e) {
            StringBuilder result = new StringBuilder("(/");
            for (AST.Exp exp : e.all())
                result.append(" ").append(exp.accept(this));
            return result + ")";
        }
    }
}
