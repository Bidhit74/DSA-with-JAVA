// Print X^N (X to the power of N) using recursion

public class PrintXPowerN {
    //Time Complexity is O(n)
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
    
    // Time Complexity :- O(log n)
    public static double optimalTimeXPowerN(double x, int n) {
        // Base case: x^0 = 1
        if (n == 0) {
            return 1;
        }
        // If n is negative, handle it by taking reciprocal of x
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double halfPower = optimalTimeXPowerN(x, n / 2);
        double halfPowerSquare = halfPower * halfPower;
    
        // Odd case handling
        if (n % 2 != 0) {
            return x * halfPowerSquare;
        }
    
        // Even case handling
        return halfPowerSquare;
    }
    
    public static void main(String[] args) {
        System.out.println(XPowerN(75, 2)); // 5625
        System.out.println(XPowerN(99, 2)); // 9801
        System.out.println(optimalTimeXPowerN(75, 2)); // 5625
        System.out.println(optimalTimeXPowerN(99, 2)); // 9801
        System.out.println(optimalTimeXPowerN(4, -2)); 
        System.out.println(optimalTimeXPowerN(2, -2)); 
    }
}
