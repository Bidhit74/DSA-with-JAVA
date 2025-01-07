public class MemberInnerClass {
    public static void main(String[] args) {
        // Create a Car object with the model name "Safari"
        Car car = new Car("Safari");

        // Create an Engine object associated with the car
        Car.Engine engine = car.new Engine();

        // Start the engine and display appropriate messages
        engine.start();
        engine.start(); // Engine is already on
        engine.stop();
        engine.stop(); // Engine is already off
    }
}

class Car {
    private String model;   // Model name of the car
    private boolean isEngine; // Engine status (on or off)

    // Constructor to initialize the model and engine state
    public Car(String model) {
        this.model = model;
        isEngine = false; // Initially, the engine is off
    }

    // Inner class to represent the car's engine
    class Engine {
        // Method to start the engine
        void start() {
            // Check if the engine is already on
            if (!isEngine) {
                isEngine = true; // Start the engine
                System.out.println(model + " engine started.");
            } else {
                // If the engine is already on, print a message
                System.out.println(model + " engine already on.");
            }
        }

        // Method to stop the engine
        void stop() {
            // Check if the engine is already off
            if (isEngine) {
                isEngine = false; // Stop the engine
                System.out.println(model + " engine stopped.");
            } else {
                // If the engine is already off, print a message
                System.out.println(model + " engine already off.");
            }
        }
    } 
}
