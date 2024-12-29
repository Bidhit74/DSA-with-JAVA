// Print sum of first N natural numbers using recursion.

public class SumOfFirstN {
    // Time and Space Complexity is O(n)
    public static int sumOfFirstN(int n) {
        // Base case // Edge case Handle
        // Base case to stop recursion
        if (n <= 1) {
            return n;
        };
        int Sn = n + sumOfFirstN(n - 1); // Recursive case
        return Sn;
    }
    public static void main(String[] args) {
        System.out.println(sumOfFirstN(0));
        System.out.println(sumOfFirstN(10));
    }
}
