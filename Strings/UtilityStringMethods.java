public class UtilityStringMethods {

    public static void printArray(String[] arr) {
        int n = arr.length;
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }
    public static void prinCharArray(char[] arr) {
        int n = arr.length;
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }
    
    public static void main(String[] args) {
        String fruits = "apple, banana, cherry ";
        
        //split(String regex): Splits a string into an array based on a regex.
        String[] parts = fruits.split(",");
        System.out.print("Splits a string into an array based on a regex " + fruits + " = ");
        printArray(parts);

        // split(String regex, int limit): Splits with a limit on the number of substrings.
        String[] parts1 = fruits.split("," , 0);
        System.out.print("Splits with a limit on the number of substrings " + fruits + " = ");
        printArray(parts1);

        // toCharArray(): Converts a string into a character array.
        char[] chars = "Bidhit".toCharArray();
        prinCharArray(chars);

        // isEmpty(): Checks if a string is empty.
        String checkEmpty = "";
        System.out.println("Checks if a string is empty: " + checkEmpty.isEmpty());
        
        // isBlank(): Checks if the string is blank (ignores whitespace).
        String checkBlanck = "     ";
        System.out.println("Checks if a string is empty: " + checkBlanck.isBlank());

        // String.join(CharSequence delimiter, String... elements): Joins multiple strings using a specified delimiter.

        //Joining array elements:
        String[] fruitsArray = { "apple", "banana", "cherry "};
        String joinArray = String.join(" + " , fruitsArray);
        System.out.println(joinArray);

        //Joining words in a sentence:
        String sentence = String.join(" - ", "Java", "is", "fun");
        System.out.println(sentence); 


    }
}
