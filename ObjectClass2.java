import java.util.*;

class Student implements Cloneable {
    int id = 10;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws Exception {
        Student st1 = new Student();
        Student st2 = (Student) st1.clone();

        System.out.println(st1.id);
        System.out.println(st2.id);

        String s = "Hello World";
        System.out.println(s.getClass());

        String s1 = new String("java");
        String s2 = new String("java");

        System.out.println("HashCode of s1:" + s1.hashCode());
        System.out.println("HashCode of s2:" + s2.hashCode());
        System.out.println(s1.equals(s2));
    }
}