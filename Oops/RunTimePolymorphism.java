public class RunTimePolymorphism {
    public static void main(String[] args) {
        /* 
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
        */
        Animal animal; // Reference of parent class
        animal = new Animal();
        animal.sound();

        animal = new Dog();
        animal.sound(); // Calls Dog's implementation

        animal = new Cat();
        animal.sound(); // Calls Cat's implementation
    }
}

// Run Time Polymorphism ( Method Overriding )
// - Achieved when a subclass provides a specific implementation of a method already defined in its parent class.
// - Resolved during runtime using dynamic method dispatch.

// Without @Override, this could lead to a mistake (method signature mismatch)
// @Override ensures that this method correctly overrides the superclass method

// Base class representing an Animal
class Animal {
    // Method to define the generic sound made by an animal
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog inheriting from Animal
class Dog extends Animal {
    // Override the sound method to provide Dog-specific behavior
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat inheriting from Animal
class Cat extends Animal {
    // Override the sound method to provide Cat-specific behavior
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
