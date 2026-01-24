// Hierarchical inheritance
public class Hierarchical_Interface {
    static class Vehicle {
        void run() {
            System.out.println("The vehicle is running");
        }
    }

    static class Car extends Vehicle {
        void speed() {
            System.out.println("car speed is 120");
        }
    }

    static class Bike extends Vehicle {
        void speed() {
            System.out.println("Bike speed is 70");
        }
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.run();
        c.speed();

        Bike b = new Bike();
        b.run();
        b.speed();
    }
}