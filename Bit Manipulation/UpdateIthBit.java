public class UpdateIthBit {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return (n | bitMask);
    }
    
    // Time and Spece Complexity : O(1)
    public static int updateIthBit(int n, int i,int newBit) {
        // if (newBit == 0) {
        //     return clearIthBit(n, i);
        // }
        // else {
        //     return setIthBit(n, i);
        // }

        // or
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return (n | bitMask);
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
