public class Question2 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.print(); // Child print kuyki overridden
        // v.display(); // Not Accessible this is child method
        Vehicle v1 = new Vehicle();
        v1.print();
    }
}

class Vehicle {
    void print() {
        System.out.println("Parent Vehicle Class");
    }
}

class Car extends Vehicle {
    @Override
    void print() {
        System.out.println("Child Car Class");
    }
    void display() {
        System.out.println("Child display method");
    }
}
