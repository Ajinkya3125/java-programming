//Exception handling

public class Exception_Handling {
    static void check(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {
        // first try-catch block
        try {
            check(20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally always executed...");
        }
        System.out.println("----------------------");

        // second try-catch block
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Error occurred");
        }
        System.out.println("----------------------");

        // third try-catch block
        try {
            int[] arr = new int[3];
            arr[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error...");
        } catch (Exception e) {
            System.out.println("General Exception...");
        }
    }
}