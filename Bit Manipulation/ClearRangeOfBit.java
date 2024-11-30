public class ClearRangeOfBit {
    // Clear the range of the bit
    // n = 119 = 1110111 , i = 1 , range = 4
    // Answer = 1100001 = 97

    // Logic : a = 111...11111 << 5 = 1111...10000 , b = 1<<1 = 000...010 - 1 = 000.001
    // a | b = 1111...10001 , n & a|b = 1110111 & 1111...10001 = 1100001 --> 97
    // a = (~0) << (range+1)  , b = (1 << i) - 1 , a|b , n & a|b

    public static int clearRangeOfBit(int n, int i, int range) {
        int a = (~0) << (range+1), b = (1 << i) - 1;
        int bitMask = a | b;
        return (n & bitMask);
    }
    public static void main(String[] args) {
        System.out.println(clearRangeOfBit(119,1,4)); // 97
    }
}
