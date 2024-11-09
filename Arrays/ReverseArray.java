public class ReverseArray {
    public static void printOutput(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //Reverse an Array
    // arr[] = {2 , 4 , 6, 8, 10};
    // reverse[] = {10, 8 , 6 , 4 , 2};

    // Time Complexity --> O(n) 
    // Space Complexity --> O(n)
    /*  
    public static int[] reverseArray(int[] arr) {
        int[] reverse = new int[arr.length];
        for (int i = 0; i < reverse.length; i++) {
            int index = arr.length - i - 1;
            reverse[i] = arr[index];
        }
        System.out.println();
        return reverse;
    }
    */
    // Time Complexity --> O(n) 
    // Space Complexity --> O(1) 
    //without extra space
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            // Using swaping method   // in-place reversal
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        // printOutput(reverseArray(arr));

        printOutput(arr);
        reverseArray(arr); // yah original array ko reverse kar dega. 
        printOutput(arr);
    }
}
