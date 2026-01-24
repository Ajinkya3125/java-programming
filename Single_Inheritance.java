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

    public static void main(String[] args) {
        B b = new B();
        b.showA();
        b.showB();
    }
}
