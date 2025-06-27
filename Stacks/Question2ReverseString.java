// Question 2 : Reverse a String using Stack (Question Ask - Microsoft,google,flipkart,paytm)

import java.util.Stack;

public class Question2ReverseString {

    private static String reversString(String str) {
        Stack<Character> ch = new Stack<>(); 
        int index = 0;
        while (index != str.length()) {
            ch.push(str.charAt(index)); // index wise push in Character Stack
            index++;
        }
        StringBuilder newStr = new StringBuilder(""); 
        while (!ch.isEmpty()) {
            char curr = ch.pop(); 
            newStr.append(curr);
        }
        return newStr.toString();
    }
    public static void main(String[] args) {
        String str = "tihdiB"; // Bidhit
        System.out.println(reversString(str)); // Bidhit
        
    }
}