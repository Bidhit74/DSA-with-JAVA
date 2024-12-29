// Problem - 5 :- Print Nth Fibonacci Number using Recursion.
// Fibonacci Series: 0 1 1 2 3 5 8 13 21 34 ........
// Nth Fibonacci Formula :- F(n) = F(n-1) + F(n-2)

public class PrintNthFibonacci {
    public static int getNthFibonacci(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return n;
        }
        // Recursive implementation
        int Fn1 = getNthFibonacci(n - 1);
        int Fn2 = getNthFibonacci(n - 2);
        return Fn1 + Fn2; // Nth term's output
    }
    public static void main(String[] args) {
        System.out.println(getNthFibonacci(5)); // Output: 5
        System.out.println(getNthFibonacci(10)); // Output: 55
    }
}
