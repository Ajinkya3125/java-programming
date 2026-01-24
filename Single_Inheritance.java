//single inheritance

public class Single_Inheritance {
    static class A {
        void showA() {
            System.out.println("This is a class A");
        }
    }

    static class B extends A {
        void showB() {
            System.out.println("This is a class B");
        }
    }

    static class C extends B {
        void showC() {
            System.out.println("This is a class C");
        }
    }

    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}