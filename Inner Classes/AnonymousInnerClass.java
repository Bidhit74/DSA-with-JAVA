// Main class to demonstrate Anonymous Inner Class
public class AnonymousInnerClass {
    public static void main(String[] args) {
        // Creating a ShoppingCart instance
        ShoppingCart cart = new ShoppingCart(200);
        // Processing payment using an Anonymous Inner Class
        cart.processPayment(new Payment() {
            @Override
            public void pay(double amount) { // Correctly implementing the interface method
                System.out.println("Paid " + amount + " using Credit Card.");
            }
        });
    }
}

// Payment interface with a method to process payment
interface Payment {
    void pay(double amount); // Interface method implicitly public
}

// ShoppingCart class to manage and process payments
class ShoppingCart {
    private double totalAmount; // Total amount to be paid

    // Constructor to initialize the total amount
    ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // Method to process payment using a Payment implementation
    void processPayment(Payment paymentMethod) {
        paymentMethod.pay(totalAmount);
    }
}
