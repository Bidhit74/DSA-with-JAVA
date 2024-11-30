public class ClearLastIthBit {
    // n = 15 = 1111
    // Clear the last ith bit , i = 2
    // 1100  --> 12
    //Logic --> using (~0) = 1111...1111 or (-1) = 1111...1111

    public static int clearLastIthBit(int n, int i) {
        // 1111.111 << 2 ==> 11111..100
        int bitMask = ((-1) << i);
        return (bitMask & n);
    }

    public static void main(String[] args) {
        System.out.println(clearLastIthBit(15,2)); // 12
        System.out.println(clearLastIthBit(15,3)); // 8
    }
}