// solve multiple inheritance problem using interface
public class Multiple_Using_Interface {
    interface A {
        void showA();
    }

    interface B {
        void showB();
    }

    static class C implements A, B {
        public void showA() {
            System.out.println("This is a A class");
        }

        public void showB() {
            System.out.println("This is a B class");
        }

        void showC() {
            System.out.println("This is a C class");
        }
    }

    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}