// Question 07: Given a balanced expression, find it contains duplicate parentheses or not. A set of parentheses are duplicate if the same subexpression is srrounded by multiple parenthesess.

// Return a true if it contains duplicates else return false.

// Example 1: (((a+(b)))+(c+d)) --> true
// Example 2: ((((a)+(b)))+(c+d))) --> true
// Example 2: ((a+b)+(c+d)) --> false

import java.util.Stack;
public class DuplicateParentheses07 {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Closing
            if (ch == ')') {
                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }
                if (count < 1) { // Found Duplicate
                    return true;
                }
            }
            else { // opening case
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "(((a+(b)))+(c+d))";
        String str1 = "((((a)+(b)))+(c+d)))";
        String str2 = "((a+b)+(c+d))";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}
