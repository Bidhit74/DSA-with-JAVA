public class CountSetBits {
    // Question :- Count set(1) bits in a number
    // Example :- 15 = 001111 --> Answer 4

    // Time Complexity : O(log n)
    public static int countSetBit(int n) {
        int count = 0;
        
        while (n > 0) {
            if ((n & 1) == 1) {  // Check if the Least Significant Bit (LSB) is 1
                count++;     
            }
            n = n >> 1; // Right shift n by 1 to check the next bit
        }
        
        return count;      
    }
    
    public static void main(String[] args) {
        System.out.println(countSetBit(15));
        System.out.println(countSetBit(16));
    }
}
