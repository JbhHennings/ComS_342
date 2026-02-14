package abstractlang;

import java.util.ArrayList;
import java.util.List;

public interface AST {

    enum AbsVal { P, N, Z, U }

    interface Visitor<T> {
        T visit(Program p);
        T visit(AtomExp e);
        T visit(AddExp e);
        T visit(MultExp e);
    }

    abstract class ASTNode {
        public abstract <T> T accept(Visitor<T> v);
    }

    class Program extends ASTNode {
        private final Exp e;
        public Program(Exp e) { this.e = e; }
        public Exp e() { return e; }
        @Override public <T> T accept(Visitor<T> v) { return v.visit(this); }
    }

    abstract class Exp extends ASTNode { }

    class AtomExp extends Exp {
        private final AbsVal v;
        public AtomExp(AbsVal v) { this.v = v; }
        public AbsVal v() { return v; }
        @Override public <T> T accept(Visitor<T> vis) { return vis.visit(this); }
    }



    abstract class CompoundExp extends Exp {
        private final List<Exp> ops;
        public CompoundExp(List<Exp> args) {
            this.ops = new ArrayList<>(args);
        }
        public List<Exp> all() { return ops; }
    }

    class AddExp extends CompoundExp {
        public AddExp(List<Exp> args) { super(args); }
        @Override public <T> T accept(Visitor<T> v) { return v.visit(this); }
    }

    class MultExp extends CompoundExp {
        public MultExp(List<Exp> args) { super(args); }
        @Override public <T> T accept(Visitor<T> v) { return v.visit(this); }
    }
}
