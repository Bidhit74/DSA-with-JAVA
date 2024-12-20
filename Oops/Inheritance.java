public class Inheritance {
    public static void main(String[] args) {
        // Create an object of the derived class Fish
        Fish shark = new Fish();
        
        // Call inherited and specific methods of the Fish class
        shark.eat();       // Inherited method from Animal class
        shark.swim();      // Method specific to Fish class
        shark.breathe();   // Inherited method from Animal class
    }
}

// Base class or Parent class representing general animals
class Animal {
    String color; // Attribute representing the color of the animal

    // Method for eating behavior
    void eat() {
        System.out.println("eats");
    }

    // Method for breathing behavior
    void breathe() {
        System.out.println("breaths");
    }
}

// Derived class or Child class representing specific animal type (Fish)
class Fish extends Animal {
    int fins; // Attribute representing the number of fins (specific to fish)

    // Method for swimming behavior (specific to fish)
    void swim() {
        System.out.println("swims in water.");
    }
}

