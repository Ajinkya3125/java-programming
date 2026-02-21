import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(() -> {
            System.out.println("Task 1 executed...");
        });

        executor.execute(() -> {
            System.out.println("Task 2 executed...");
        });

        executor.shutdown();
    }
}