// Print X^N (X to the power of N) using recursion

public class PrintXPowerN {
    public static int XPowerN(int x, int n) {
        // Base case: x^0 = 1
    if (n == 0) {
        return 1;
    }
    // If n is negative, handle it by taking reciprocal of x
    if (n < 0) {
        x = 1 / x;
        n = -n;
    }
        return x * XPowerN(x, n - 1);
    }
    public static void main(String[] args) {
        System.out.println(XPowerN(75, 2)); // 5625
        System.out.println(XPowerN(99, 2)); // 9801
    }
}
