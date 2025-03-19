//Question 2 : Keypad Combinations
// Given a string containing digits from 2-9 inclusive, print all possible letter combinations that the number could represent. You can print the answer in any order.

//A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

import java.util.ArrayList;
import java.util.List;

public class KeypadCombinations {
    
    // private static final String[] Keypad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    /* 
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
        */
    private static final String[] KEYPAD = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public static void keypadCombinations(String digit, int idx, StringBuilder temp, List<String> result) {
        // Base Case
        if (idx == digit.length()) {
            result.add(temp.toString()); // Add completed combination
            return;
        }

        // Get the corresponding characters for the current digit
        String str = KEYPAD[digit.charAt(idx) - '0'];
        for (char ch : str.toCharArray()) {
            temp.append(ch);  // Append character
            keypadCombinations(digit, idx + 1, temp, result); // Recursive call
            temp.deleteCharAt(temp.length() - 1); // **Backtracking step** (removes last character)
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result; // Handle empty input
        keypadCombinations(digits, 0, new StringBuilder(), result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}