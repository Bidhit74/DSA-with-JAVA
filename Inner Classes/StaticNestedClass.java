public class StaticNestedClass {
    public static void main(String[] args) {
        // Creating an instance of the outer class (Computer)
        Computer computer = new Computer("HP", "ABC");
        computer.displayComputerInfo(); // Displaying computer information

        // Creating an instance of the static nested class (USB)
        Computer.USB usb = new Computer.USB("TYPE-C");
        usb.displayInfo(); // Displaying USB information
    }
}

// Outer class representing a Computer
class Computer {
    private String brand;  // Brand of the computer
    private String model;  // Model of the computer

    // Constructor to initialize the Computer object
    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Static nested class representing a USB device
    static class USB {
        private String type; // Type of the USB (e.g., TYPE-C, USB 3.0)

        // Constructor to initialize the USB object
        public USB(String type) {
            this.type = type;
        }

        // Method to display USB information
        void displayInfo() {
            System.out.println("USB Type : " + type);
        }
    }

    // Method to display computer information
    public void displayComputerInfo() {
        System.out.println("Computer Brand : " + brand + " and model : " + model);
    }
}
