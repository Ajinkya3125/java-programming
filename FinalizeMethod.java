class Demo {
    protected void finalize() {
        System.out.println("Finalize method called...");
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        Demo d = new Demo();
        d = null;
        System.gc();
        System.out.println("Main method finished...");
    }
}
