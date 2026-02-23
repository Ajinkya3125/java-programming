import java.util.*;

// Functional Interface 1
interface MyInterface {
    void sayHello();
}

// Functional Interface 2
interface Calculator {
    int add(int n1, int n2);
}

public class Main {

    public static void main(String[] args) {

        // Lambda Expression for MyInterface
        MyInterface obj = () -> System.out.println("Hello World");
        obj.sayHello();

        // Lambda Expression for Calculator
        Calculator c = (n1, n2) -> n1 + n2;
        System.out.println(c.add(2, 3));
    }
}