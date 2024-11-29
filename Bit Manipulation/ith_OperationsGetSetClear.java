public class ith_OperationsGetSetClear {
    // Get ith bit
    // Example:-  15 = 000...1111 
    // find ith bit , i = 2
    // in 14 --> 2th bit = 1   
    // solve : n & (1<<i) --> 15 & (0001 << 2)  ---> 001111 & 000100 = 000100 --> 2nd bit = 1

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }
        
    public static void main(String[] args) {
        int n = 8;
        int i = 2;
        System.out.println(n + " " + i + "th bit position = " + getIthBit(n, i));
    }
}
