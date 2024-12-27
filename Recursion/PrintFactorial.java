// Problem 3 - Print factorial of a number n.

public class PrintFactorial {
    public static int printFactorial(int n) {
        // Base Case
        if (n == 0) {
            return 1; 
        }
        int factNM1 = printFactorial(n - 1); 
        int fn = n * factNM1;
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFactorial(n));
    }
}
