//Question 2 : Keypad Combinations
// Given a string containing digits from 2-9 inclusive, print all possible letter combinations that the number could represent. You can print the answer in any order.

//A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


public class KeypadCombinations {
    
    private static final String[] Keypad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    // Time Complexity : O(4^n) : exponential 
    // Space Complexity : O(n^2)
    public static void keypadCombinations(String digit, int idx, String temp) {
        // Base Case 
        if (idx >= digit.length()) {
            System.out.print(temp + " ");
            return;
        }
        // Recursion
        int ch = digit.charAt(idx) - '0'; // Convert char to digit index
        String str = Keypad[ch];
        for (int i = 0; i < str.length(); i++) {
            keypadCombinations(digit, idx + 1, temp + str.charAt(i));
        }
    }
    
    // Time Complexity : O(4^n) : exponential 
    // Space Complexity : O(n)
    public static void generateCombinations(String digit, int idx, StringBuilder temp) {
        // Base Case
        if (digit.length() == idx) {
            System.out.print(temp + " ");
            return;
        }

        // Recursion
        int id = digit.charAt(idx) - '0';
        String str = Keypad[id];
        for (char ch : str.toCharArray()) {
            temp.append(ch);
            generateCombinations(digit, idx + 1, temp);
            temp.deleteCharAt(temp.length() - 1); // Backtracking 
        }
    }
    public static void main(String[] args) {
        String digit = "23";
        if (!digit.isEmpty()) {
            keypadCombinations(digit, 0, "");
            System.out.println();
            generateCombinations(digit, 0, new StringBuilder());
        } else {
            System.out.println("No input provided!");
        }
    }
}