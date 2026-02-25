import java.util.function.Predicate;
public class Main
{
    public static void main(String[] args)
    {
        Predicate<Integer> p = x -> x > 15;
        System.out.println(p.test(20));
        System.out.println(p.test(10));
        
        Predicate<String> startsWithA = s -> s.startsWith("A");
        System.out.println(startsWithA.test("Apple"));
        
        Predicate<Integer> p1 = a -> a > 15;
        Predicate<Integer> p2 = b -> b < 20;
        System.out.println(p1.or(p2).test(30));
        System.out.println(p1.and(p2).test(30));
    }
}