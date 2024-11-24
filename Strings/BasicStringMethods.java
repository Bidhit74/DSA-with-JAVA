public class BasicStringMethods {
    public static void main(String[] args) {
        String fullName = "Bidhit Kumar";
        //length(): Returns the number of characters in the string.
        System.out.println("Length of " + fullName + " = " + fullName.length());

        //charAt(int index): Gets the character at the specified index.
        System.out.println("Character at the specified index" + fullName + " = " + fullName.charAt(0));

        // substring(int beginIndex) :- Returns a substring starting from the specified index.
        System.out.println("Substring starting of " + fullName + " = " + fullName.substring(2));

        //substring(int startIndex, int endIndex): Extracts part of the string.
        System.out.println("Substring starting of " + fullName + " = " + fullName.substring(0,5));

    }
}
