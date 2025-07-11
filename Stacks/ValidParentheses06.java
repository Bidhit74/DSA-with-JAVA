// Question 6 :- Valid Parentheses
// Statement: Given a string s containing just the characters '(', ')', '{', '}', '[', ']' determine if the input string is valid.
// An input string is valid if:
// 1. Open brackets must be closed by the same type of brackets.
// 2. Open brakets must be closed in the correct order.
// 3. Every close bracket has a corresponding open bracket of the same type.

// input = "(){}[]" or "()" --> Correct --> Valid
// input = ")(" or "(]" --> Incorrect --> Not Valid

import java.util.Stack;

public class ValidParentheses06 {

    static boolean isValidParentheses(String str) {
        Stack<Character> ch = new Stack<>();

        
        for (int i = 0; i < str.length(); i++) {
            // Opening Parenthese
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                ch.push(str.charAt(i));
            }
            // Closing Parenthes
            else if (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']') {
                if (ch.isEmpty()) {
                    return false;
                }
                // Pairs 
                else if ((ch.peek() == '(' && str.charAt(i) == ')')
                        || (ch.peek() == '[' && str.charAt(i) == ']')
                        || (ch.peek() == '{' && str.charAt(i) == '}')
                        ) {
                    ch.pop();
                } else {
                    return false;
                }
            }
            // Invalid Parenthese
            else {
                System.err.println("Invalid Parenthese");
            }
        }
        
        if(ch.isEmpty()){
            return true;
        }else{
            return false;
        }
    
    }
    public static void main(String[] args) {
        String str = "([{{}}])"; // True
        String str1 = "([{{}}))"; // false

        System.err.println(isValidParentheses(str)); // True
        System.err.println(isValidParentheses(str1)); // False
    }
}
