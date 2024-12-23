// Super Keyword :-  Super keyword is used to refer immediate parent class object.
//	To access parent’s properties.
//	To access parent’s functions.
//	To access parent’s constructor.

public class SuperKey {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}

class Parent {
    String name = "ParentClass";

    Parent() {
        System.out.println("Parent Constructor Called");
    }

    void display() {
        System.out.println("Display Method in Parent");
    }
}

class Child extends Parent {
    String name = "ChildClass";

    Child() {
        super(); // Calls Parent's constructor // by default call bhi hota hai
        System.out.println("Child Constructor Called");
    }

    void show() {
        System.out.println("Child name: " + name); // Accesses Child's name
        System.out.println("Parent name: " + super.name); // Accesses Parent's name
        super.display(); // Calls Parent's display method
    }
}
