// Question 3: Reverse a Stack

import java.util.Stack;

public class Question3ReverseStack {
    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
        System.out.println();
    }

    // Frute force approach
    // Time and Space Complexity: O(n)
    // public static void reverseStack(Stack<Integer> s) {
    //     Stack<Integer> newStack = new Stack<>();
    //     while (!s.isEmpty()) {
    //         int data = s.pop();
    //         newStack.push(data);
    //     }
    //     printStack(newStack);
    // }

    // Efficient way : Time and space Complexity --> O(n) and (1) 
    public static void reverseStack(Stack<Integer> s) {
        // Base Case 
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s); // Recursion
        pushBottom(s, top); // BackTracking
    }

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
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        // printStack(s);  // 1 2 3 4 5
        reverseStack(s); 
        printStack(s); // 5 4 3 2 1

    }
}
