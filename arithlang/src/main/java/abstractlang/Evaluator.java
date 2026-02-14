package abstractlang;

import abstractlang.AST.AbsVal;
import abstractlang.AST.*;

import java.util.List;

public class Evaluator implements AST.Visitor<AbsVal> {
    private static int idx(AbsVal v) {
        return switch (v) {
            case P -> 0;
            case N -> 1;
            case Z -> 2;
            case U -> 3;
        };
    }

    public AbsVal valueOf(AST.Program p) {
        return p.e().accept(this);
    }

    private static final AbsVal[][] PLUS = {
            {AbsVal.P, AbsVal.U, AbsVal.P, AbsVal.U},
            {AbsVal.U, AbsVal.N, AbsVal.N, AbsVal.U},
            {AbsVal.P, AbsVal.N, AbsVal.Z, AbsVal.U},
            {AbsVal.U, AbsVal.U, AbsVal.U, AbsVal.U}
    };
    private static final AbsVal[][] TIMES = {
            {AbsVal.P, AbsVal.N, AbsVal.Z, AbsVal.U},
            {AbsVal.N, AbsVal.P, AbsVal.Z, AbsVal.U},
            {AbsVal.Z, AbsVal.Z, AbsVal.Z, AbsVal.U}
    };

    @Override
    public AbsVal visit(Program p) {
        return p.e().accept(this);
    }

    @Override
    public AbsVal visit(AtomExp e) {
        return e.v();
    }

    @Override
    public AbsVal visit(AST.AddExp e) {
        List<AST.Exp> ops = e.all();

        if (ops.size() != 2) throw new RuntimeException("error");
        AbsVal a = ops.get(0).accept(this);
        AbsVal b = ops.get(1).accept(this);
        return PLUS[idx(b)][idx(a)];
    }

    @Override
    public AbsVal visit(AST.MultExp e) {
        List<AST.Exp> ops = e.all();
        if (ops.size() != 2) throw new RuntimeException("error");
        AbsVal a = ops.get(0).accept(this);
        AbsVal b = ops.get(1).accept(this);
        return TIMES[idx(b)][idx(a)];

    }
}
