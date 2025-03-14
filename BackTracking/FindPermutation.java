// Question: Find Permutations --> Formula - n!
// Input - "abc"
// Output - abc, acb, bac, bca, cab, cba

public class FindPermutation {

    // Time Complexity : O(n * n!)
    // Space Complexity : O(n)
    public static void findPermutation(String str, String ans) {
        // Base Case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recursive Case
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newStr, ans+ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}
