public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.lags = 4;
        dobby.color = "black";
        dobby.eat();
        dobby.breathe();
        System.out.println(dobby.lags);
        System.out.println(dobby.color);
    }
}

//Base Class
class Animal {
    String color;  
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breaths");
    }
}

// Derived class
class Mammal extends Animal{
    int lags;
}

//Derived class
class Dog extends Mammal{
    String bread;
}