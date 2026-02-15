class Student {
    int id = 10;
    String name = "Ajinkya";

    public String toString() {
        return id + " " + name;
    }

    public static void main(String[] args) {
        // toString()
        Student s = new Student();
        System.out.println(s);
        Object obj = new Object();
        System.out.println(obj);

        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}