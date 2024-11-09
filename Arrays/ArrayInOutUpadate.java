public class ArrayInOutUpadate {
    public static void main(String[] args) {
        int arr[] = new int[3]; // Array with 3 elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // Output: 10 20 30
        }
        arr[1] = 50; // Update element at index 1
        System.out.println(arr[1]); // Output: 50
    }
}
