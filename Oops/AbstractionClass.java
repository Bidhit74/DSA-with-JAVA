// Abstract Class
//	Cannot create an instance/object of abstract class. 
//	Can have abstraction – abstract methods.
//	Can have constructors


public class AbstractionClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        Cat c = new Cat();
        h.eat();
        h.walk();
        c.eat();
        c.walk();
        System.out.println(h.color);
        System.out.println(c.color);
        h.changeColor();
        System.out.println(h.color);
        c.changeColor();
        System.out.println(c.color);
        

        // Animal animal = new Animal();  // Cannot create an instance/object of abstract class.
        // Creating an object of Mustang class (inheriting from Horse, which inherits Animal)
        // Mustang myHorse = new Mustang();
        // Hierarchy constructors ---> Animal > Horse > Mustang 

    }
}

// Abstract class Animal with an abstract method and a concrete method
abstract class Animal {
    String color;

    // Constructor to initialize color and print a message
    Animal() {
        color = "Brown"; // Default color for all animals
        System.out.println("Animal Constructor called...");
    }

    // Concrete method to demonstrate a common behavior for all animals
    void eat() {
        System.out.println("Animal eats");
    }

    // Abstract method that must be implemented by subclasses
    abstract void walk(); // This serves as a blueprint for subclasses
}

// Horse class inherits from Animal and implements the walk method
class Horse extends Animal {
    // Constructor for Horse class
    Horse() {
        System.out.println("Horse Constructor called...");
    }

    // Method to change the color of the horse
    void changeColor() {
        color = "Dark brown"; // Modify the color property
    }

    // Implementation of the abstract method 'walk' specific to Horse
    void walk() {
        System.out.println("Horse walks");
    }
}

// Mustang class inherits from Horse and indirectly from Animal
class Mustang extends Horse {
    // Constructor for Mustang class
    Mustang() {
        System.out.println("Mustang Constructor called...");
    }
}

// Cat class inherits from Animal and implements the walk method
class Cat extends Animal {
    // Method to change the color of the cat
    void changeColor() {
        color = "Black"; // Modify the color property
    }

    // Implementation of the abstract method 'walk' specific to Cat
    void walk() {
        System.out.println("Cat walks");
    }
}