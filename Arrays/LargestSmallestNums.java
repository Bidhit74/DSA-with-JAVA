import java.util.Scanner;
public class LargestSmallestNums {
    public static int[] inputArray(int[] arr, int size) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        return arr;
    }
    // Q - 2 :- find the largest number in an array
    public static int largestNums(int[] arr) {
        int largest = Integer.MIN_VALUE; // (-Infinity) 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest)
            largest = arr[i];
            
        }
        return largest;
    }
    // Q - 3 :- find the smallest number in an array 
    public static int smallestNums(int[] arr) {
        int smallest = Integer.MAX_VALUE; // (+Infinity) 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest)
            smallest = arr[i];
        }
        return smallest;
    } 
    public static void main(String[] args) {
        int size = 5;
        int[] arr = new int[size];
        System.out.println("Please enter 5 numbers");
        inputArray(arr, size);
        System.out.println("Largest number :- " + largestNums(arr));
        System.out.println("smallest number :- " + smallestNums(arr));
    }
}
