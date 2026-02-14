package abstractlang;

public class Printer {
    public void print(AST.AbsVal v) {
        switch (v) {
            case P -> System.out.println("p");
            case N -> System.out.println("n");
            case Z -> System.out.println("z");
            case U -> System.out.println("u");
        }
    }
}
