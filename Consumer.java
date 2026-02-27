import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> c = x -> System.out.println(x);
        c.accept("Hello World");
    }
}