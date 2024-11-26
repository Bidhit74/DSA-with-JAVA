public class LargestString {
    // Question :- for ginve set of strings , print the largest string.

    public static void printLargestString(String[] str) {
        int n = str.length;
        String largest = str[0];
        for (int i = 1; i < n; i++) {

            // 0 - Equals , -ve -> largest < str , +ve -> largest > str
            
            // This compareTo - Speling me big latter and small letter difference compare karta
            /*
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
            */

            // This compareToIgnoreCase - Speling me big latter and small letter same to same compare karta
            if (largest.compareToIgnoreCase(str[i]) < 0) {
                largest = str[i];
            }
        }
        System.out.println("Largest String :: " + largest);
    }
    public static void main(String[] args) {
        String fruits[] = { "apple", "Orange", "oranga", "mango" };
        printLargestString(fruits);
    }
}