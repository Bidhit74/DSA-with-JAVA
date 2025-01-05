// Problem 14 - Binary String Problem  (Ask in Paytm)
// Print all binary strings of size N without consecutive ones.

public class BinaryString {

    /* 
    public static void binaryStrWithoutConsecutOnes(int n, int lastPlace, String str) {
            // Base Case: If length is 0, print the current string
            if (n == 0) {
                System.out.println(str);
                return;
            }
            // Recursive call to add '0' at the current position
            binaryStrWithoutConsecutOnes(n - 1, 0, str+"0");
            // If last digit was '0', you can safely add '1' without consecutive 1's
            if (lastPlace == 0) {
                binaryStrWithoutConsecutOnes(n - 1, 1, str+"1");
            }
        }
    */
    public static void binaryStrWithoutConsecutOnes(int n, int lastPlace, StringBuilder str) {
        // Base Case: If length is 0, print the current string
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // Recursive call to add '0' at the current position
        binaryStrWithoutConsecutOnes(n - 1, 0, str.append("0"));
        str.deleteCharAt(str.length() - 1); // Undo the append of '0'

        // If last digit was '0', you can safely add '1' without consecutive 1's
        if (lastPlace == 0) {
            binaryStrWithoutConsecutOnes(n - 1, 1, str.append("1"));
            str.deleteCharAt(str.length() - 1); // Undo the append of '1'
        }
    }
    
    public static void binaryStrWithoutConsecutZeros(int n, int lastPlace, StringBuilder str) {
        // Base Case 
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binaryStrWithoutConsecutZeros(n-1 , 1, str.append("1"));
        str.deleteCharAt(str.length() - 1); // Undo the append of '1'

        if (lastPlace == 1) {
            binaryStrWithoutConsecutZeros(n-1 , 0, str.append("0"));
            str.deleteCharAt(str.length() - 1); // Undo the append of '0'
        }

    }
    
    
    public static void main(String[] args) {
        System.out.println("Binary String Without Consecutive Ones");
        binaryStrWithoutConsecutOnes(4, 0, new StringBuilder());
        System.out.println("Binary String Without Consecutive Zeros");
        binaryStrWithoutConsecutZeros(4, 1,new StringBuilder());
    }
}
