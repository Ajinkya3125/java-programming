class MyThread extends Thread {
    public void run() {
        System.out.println("Thread executing....");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.run();
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable interface executing....");
    }

    public static void main(String[] args) {
        MyRunnable m1 = new MyRunnable();
        Thread t = new Thread(m1);
        t.start();
    }
}