public class CheckPowerOf2 {
    // Question :- Check if a number is a power of 2 or not.

    // Logic : 4 & 3 --> 100 & 011 = 000 --> 0
    // Logic : 8 & 7 --> 1000 & 0111 = 0000 --> 0
    // Logic : 16 & 15 --> 10000 & 01111 = 00000 --> 0
    // Logic : n & (n - 1) --> give me output 0 --> Thats a power of 2

    public static boolean checkPowerOf2(int n) {
        // if ((n & (n - 1)) == 0)
        //     return true;
        // else
        //     return false;

        // or in single line 
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(checkPowerOf2(128)); // true
        System.out.println(checkPowerOf2(16)); // true
        System.out.println(checkPowerOf2(132)); // false
        System.out.println(checkPowerOf2(15)); // false
    }
}

