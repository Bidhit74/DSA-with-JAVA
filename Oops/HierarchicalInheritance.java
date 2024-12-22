public class HierarchicalInheritance {
    public static void main(String[] args) {
        Mammal m1 = new Mammal(); // Creating a Mammal object
        Fish f1 = new Fish(); // Creating a Fish object
        Bird b1 = new Bird(); // Creating a Bird object

        m1.walk(); // Mammal-specific method
        m1.eat(); // Inherited from Animal
        m1.breathe(); // Inherited from Animal

        f1.swim(); // Fish-specific method
        f1.eat(); // Inherited from Animal
        f1.breathe(); // Inherited from Animal

        b1.fly(); // Bird-specific method
        b1.eat(); // Inherited from Animal
        b1.breathe(); // Inherited from Animal
    }
}

//Hierarchical Inheritance is a type of inheritance in Java where multiple subclasses inherit from a single parent class.

// Parent class: Animal
class Animal {
    String color; // Common attribute for all animals
    void eat() {
        System.out.println("Eats"); // Common behavior for all animals
    }
    void breathe() {
        System.out.println("Breathe"); // Common behavior for all animals
    }
}

// Subclass: Fish, inherits from Animal
class Fish extends Animal {
    void swim() {
        System.out.println("Swim"); // Behavior specific to Fish
    }
}

// Subclass: Mammal, inherits from Animal
class Mammal extends Animal {
    void walk() {
        System.out.println("Walk"); // Behavior specific to Mammals
    }
}

// Subclass: Bird, inherits from Animal
class Bird extends Animal {
    void fly() {
        System.out.println("Fly"); // Behavior specific to Birds
    }
}
