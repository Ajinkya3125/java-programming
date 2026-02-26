import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x * 2;
        System.out.println(f.apply(6));
        // System.out.println(p.test(10));

        Function<String, Integer> length = s -> s.length();
        System.out.println(length.apply("Red Apple"));

        Function<Integer, Integer> p1 = a -> a * a;
        Function<Integer, Integer> p2 = b -> b * 2;
        System.out.println(p1.andThen(p2).apply(3));
        System.out.println(p1.compose(p2).apply(5));
    }
}