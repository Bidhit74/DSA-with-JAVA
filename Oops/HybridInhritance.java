public class HybridInhritance {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Mammal mammal = new Mammal();
        Dolphin dolphin = new Dolphin();

        // Using Fish object
        fish.eat();
        fish.swim();

        // Using Mammal object
        mammal.eat();
        mammal.walk();

        // Using Dolphin object
        dolphin.eat();
        dolphin.walk();
        dolphin.swim();

        /* 
        Shark s1 = new Shark();
        Dog d1 = new Dog();
        Peacock p1 = new Peacock();
        System.out.println("Shark Derived class use");
        s1.shark();
        s1.swim();
        s1.eat();
        System.out.println("Dog Derived class use");
        d1.color = "Black";
        d1.dogColor();
        d1.walk();
        d1.eat();
        System.out.println("Peacock Derived class use");
        p1.color = "Green";
        p1.peacockColor();
        p1.fly();
        p1.eat();
        */
    }
}

// Hybrid Inheritance in Java, combining classes and interfaces to achieve the hybrid structure:
//This is Indirectly implemented multiple inheritance

// Hybrid Inheritance combines single inheritance and interface implementation to achieve multiple behaviors without ambiguity.

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Interface for aquatic behavior
interface Aquatic {
    void swim();
}

// Interface for terrestrial behavior
interface Terrestrial {
    void walk();
}

// Class Fish inherits from Animal and implements Aquatic
class Fish extends Animal implements Aquatic {
    public void swim() {
        System.out.println("Fish Swimming");
    }
}

// Class Mammal inherits from Animal and implements Terrestrial
class Mammal extends Animal implements Terrestrial {
    public void walk() {
        System.out.println("Mammal walks");
    }
}

// Class Dolphin inherits from Mammal and implements Aquatic
class Dolphin extends Mammal implements Aquatic {
    public void swim() {
        System.out.println("Dolphin swim");
    }
}

//Hybrid Inheritance is a combination of two or more types of inheritance in Java. Since Java does not support multiple inheritance directly (to avoid ambiguity), hybrid inheritance can only be achieved using a combination of classes and interfaces.

/* 
// Demonstrating Hybrid Inheritance using a combination of classes
// Base class: Animal
class Animal {
    String color; // Common property for all animals
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

// Subclass: Shark, inherits from Fish
class Shark extends Fish {
    void shark() {
        System.out.println("Shark"); // Behavior specific to Shark
    }
}

// Subclass: Mammal, inherits from Animal
class Mammal extends Animal {
    void walk() {
        System.out.println("Walk"); // Behavior specific to Mammals
    }
}

// Subclass: Dog, inherits from Mammal
class Dog extends Mammal {
    void dogColor() {
        System.out.println("Dog Color : " + color); // Accessing inherited property
    }
}

// Subclass: Bird, inherits from Animal
class Bird extends Animal {
    void fly() {
        System.out.println("Fly"); // Behavior specific to Birds
    }
}

// Subclass: Peacock, inherits from Bird
class Peacock extends Bird {
    void peacockColor() {
        System.out.println("Peacock Color : " + color); // Accessing inherited property
    }
}
*/