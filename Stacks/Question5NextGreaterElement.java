// Question 5 - Next Greater Element
// Statement: The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

// Input: arr = [6,8,0,1,3]
// Output: nextGreater = [8, -1, 1, 3, 1]
// -1 is represent no next greater value exits

import java.util.Stack;

public class Question5NextGreaterElement {

    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }
    // Brute Force Approach
    // Time Complexity --> O(n^2) and Space Complexity O(n)
    static int[] bruteForceNextGreater(int[] arr) {
        int[] nextGreater = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    nextGreater[i] = arr[j];
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                nextGreater[i] = -1;
            }
        }
        return nextGreater;
    }
    
    // Stack Approach - Efficient Way
    // Time Complexity --> outer loop + inner loop ==>  O(n) + O(2n) = O(3n) --> O(n) 
    // Time Complexity --> O(n) and Space Complexity O(n)
    static int[] nextGreater(int[] arr) {
        int[] nextGreater = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            // Step 1 - loop check stack
            while (!s.isEmpty() && arr[i] >= s.peek()) {
                s.pop();
            }
            // Step 2 - element add
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = s.peek();
            }
            // Step 3 -- stack inside element add
            s.push(arr[i]);
        }
        return nextGreater;
    }
    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };
        printArray(arr);
        System.out.println("\n Brute Force Approach");
        printArray(bruteForceNextGreater(arr));
        System.out.println("\n Stack Approach");
        printArray(nextGreater(arr));
    }
}
