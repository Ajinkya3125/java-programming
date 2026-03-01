import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> isEven = x -> x % 2 == 0;
        Function<Integer, Integer> square = x -> x * x;
        Consumer<Integer> print = x -> System.out.println(x);
        Supplier<Integer> number = () -> 10;

        int value = number.get();

        if (isEven.test(value)) {
            print.accept(square.apply(value));
        }
    }
}