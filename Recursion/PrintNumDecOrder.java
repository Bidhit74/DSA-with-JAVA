// Problem 1 - Print number from n to 1 in decreasing order using recursion
public class PrintNumDecOrder {
    public static void printNumDecOrder(int n) {
        // Base case
        if (n == 1) {
            System.out.print(n); // Print 1
            return; // Exit the function
        }
        // Recursive case
        System.out.print(n + " "); //  n = 10 Print 10 , 9, 8, 7, 6, 5, 4, 3, 2
        printNumDecOrder(n - 1);
    }
    public static void main(String[] args) {
        int n = 10;
        printNumDecOrder(n);
    }
}
