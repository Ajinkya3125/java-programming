//final keyword as variable
public class Final_Keyword {
    static class Student {
        final int marks = 90;

        void display() {
            System.out.println("Marks:" + marks);
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}

// final keyword as method
public class Final_Keyword {
    static class Student {
        final void display() {
            System.out.println("This is a final method");
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}

// final keyword as class
public class Final_Keyword {
    static final class Student {
        void display() {
            System.out.println("This is a student class with the final keyword");
        }
    }

    public static void main(String[] args) {
        Student t = new Student();
        t.display();
    }
}