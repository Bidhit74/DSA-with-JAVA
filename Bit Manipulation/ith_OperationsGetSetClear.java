public class ith_OperationsGetSetClear {
    // Get ith bit
    // Example:-  15 = 000...1111 
    // find ith bit , i = 2
    // in 14 --> 2th bit = 1   
    // solve : n & (1<<i) --> 15 & (0001 << 2)  ---> 001111 & 000100 = 000100 --> 2nd bit = 1
    // Time and Spece Complexity : O(1)
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    
    // Set ith Bit = mean set ith bit = 1;
    // Example : 8 = 1000 --> Set 2th Bit = 1100 --> ans = 12
    // Logic :- N OR(|) (1<<i)
    // Time and Spece Complexity : O(1)
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return (n | bitMask);
    }

    // Clear ith Bit = mean set ith bit = 0;
    // Example : 12 = 1100 --> Set 2th Bit = 1000 --> ans = 8
    // Logic :- N AND(&) NOT(~)(1<<i)
    // Time and Spece Complexity : O(1)
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static void main(String[] args) {
        int n = 7;
        int i = 2;
        System.out.println(n + " " + i + "th bit get position = " + getIthBit(n, i));
        System.out.println(10 + " " + 2 + "th bit set position = " + setIthBit(16, 3));
        System.out.println(10 + " " + 2 + "th bit set position = " + setIthBit(8, 2));
        System.out.println(12 + " " + 2 + "th bit clear position = " + clearIthBit(12, 2));
    }
}
