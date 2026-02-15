class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student implements Cloneable {
    int id;
    Address address;

    Student(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    protected Object clone() throws CloneNotSupportedException {
        Address newAddress = new Address(this.address.city);
        return new Student(this.id, newAddress);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        Address add = new Address("Pune");
        Student s1 = new Student(101, add);

        Student s2 = (Student) s1.clone();

        s2.address.city = "Mumbai";

        System.out.println(s1.address.city);
        System.out.println(s2.address.city);
    }
}
