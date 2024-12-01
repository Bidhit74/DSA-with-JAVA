public class ModularExponentiation {

    //Time Complexity :- O(Log n)
    public static int modularExponentiation(int base, int exponent, int mod) {
        int result = 1;
        base = base % mod; // Handle if base is larger than mod
        while (exponent > 0) {
            // If LSB of exponent is 1 (odd exponent)
            if ((exponent & 1) == 1) {
                result = (result * base) % mod; // Multiply and apply mod
            }

            base = (base * base) % mod; // Square the base and apply mod
            exponent >>= 1; // Right shift exponent by 1 (divide by 2)
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(modularExponentiation(5, 3, 5)); // 0
        System.out.println(modularExponentiation(5, 3, 20)); // 25
    }
}
