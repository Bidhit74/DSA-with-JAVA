// Problem 2: Print numbers from 1 to n in increasing order using recursion.

public class PrintNumIncrOrder {

    public static void printNumIncrOrder(int n) {
        //Base Case or Termination Condition
        if (n == 1) {
            System.out.print(n + " "); // Print 1
            return; // Exit the function    
        }
        printNumIncrOrder(n - 1); // Recursive case
        System.out.print(n + " "); // Print 2, 3, 4, 5, 6, 7, 8, 9, 10

    }

    public static void main(String[] args) {
        int n = 10;
        printNumIncrOrder(n);
    }
}
