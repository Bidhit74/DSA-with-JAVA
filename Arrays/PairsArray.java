public class PairsArray {
    //Pairs in an Array.
    // arr[] = {2, 4 , 6, 8, 10};
    // Output 
    // (2,4) (2,6) (2,8) (2,10)
    // (4,6) (4,8) (4,10)
    // (6,8) (6,10)
    // (8,10)

    //Time Complexity -- O(n^2)  --> Space Complexity -- O(1)
    public static void printPairsArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
        int totalPair = n * (n - 1) / 2;
        System.out.println("Total Pair = " +totalPair);
    }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10,12};
        printPairsArray(arr);
    }
}
