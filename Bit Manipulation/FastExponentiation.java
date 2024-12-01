public class FastExponentiation {
    // Fast exponentiation
    // a^n :- 5^3 = 5 * 5* 5 = 125
    // Time complexity: O(log n)

    public static int fastExponentiation(int base, int exponent) {
        int result = 1;
    
        while (exponent > 0) {
            // Check if the current exponent's LSB is 1 (odd exponent)
            if ((exponent & 1) == 1) {
                result *= base;  // Multiply current base to the result
            }
    
            base *= base;        // Square the base for the next power of 2
            exponent >>= 1;      // Right shift exponent
        }
    
        return result;  // Return the final computed result
    }    
        
    public static void main(String[] args) {
        System.out.println(fastExponentiation(5,4));
        System.out.println(fastExponentiation(2,8));
    }
}
