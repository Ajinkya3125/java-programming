public class Main {
    static volatile boolean flag = false;

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while (!flag) {
            }
            System.out.println("Stopped..");
        });

        t.start();
        flag = true;
    }
}