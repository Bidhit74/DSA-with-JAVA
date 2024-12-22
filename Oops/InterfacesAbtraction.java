public class InterfacesAbtraction {
    public static void main(String[] args) {
        Queen q = new Queen();
        King k = new King();
        Rook r = new Rook();
        q.moves();
        k.moves();
        r.moves();

        Car mycar = new Car();
        mycar.drive();
        mycar.fuelType();
    }
}

interface ChessPlayer {
    // Abstract method (no implementation), all implementing classes must provide their own definition.
    void moves(); 
}

// Queen class implements ChessPlayer interface
class Queen implements ChessPlayer {
    // Implementing the 'moves()' method, defining the Queen's movement
    public void moves() {
        System.out.println("Up, Down, Left, Right, Diagonal (in all 4 directions)");
    }
}

// Rook class implements ChessPlayer interface
class Rook implements ChessPlayer {
    // Implementing the 'moves()' method, defining the Rook's movement
    public void moves() {
        System.out.println("Up, Down, Left, Right");
    }
}

// King class implements ChessPlayer interface
class King implements ChessPlayer {
    // Implementing the 'moves()' method, defining the King's movement
    public void moves() {
        System.out.println("Up, Down, Left, Right, Diagonal - (By 1 Step)");
    }
}

// Multiple Inheritance

// Interface for vehicles that can drive
interface Vehicle {
    void drive();
}

// Interface for vehicles that require fuel
interface Fuel {
    void fuelType();
}

// Class Car implements both Vehicle and Fuel interfaces
// This simulates a car that can drive and uses fuel
class Car implements Vehicle, Fuel {
    // Implementing the 'drive()' method from the Vehicle interface
    public void drive() {
        System.out.println("Car is driving");
    }

    // Implementing the 'fuelType()' method from the Fuel interface
    public void fuelType() {
        System.out.println("Car uses petrol as fuel");
    }
}

