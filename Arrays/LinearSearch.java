public class LinearSearch {
    // Q:-1 -- Linear search algorithm
    // Find the index of element in given array.
    // arr[] = {2,4,6,8,10,12,14,16};
    // find the index 10 (key) == index value --> 4
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;
        int index = linearSearch(arr, key);

        if (index == -1) {
            System.out.println("Key = " + key +" Not found");
        }
        else {
            System.out.println("Key = " + key + "  index = " + index);
        }
    }
    
}
