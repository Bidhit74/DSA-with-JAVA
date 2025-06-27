// Question 1 --> Push at the bottom of the stack.

import java.util.Stack;

public class Question1PushBottom {

    // Time Complexity is O(n) without any extra space
    public static void pushBottom(Stack<Integer> s, int data) {
        // Base Case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop(); // this is remove data and store data in top
        pushBottom(s, data); // Recursion call
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        pushBottom(s, 5);
        
        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
        // 4 3 2 1 5
    }
}