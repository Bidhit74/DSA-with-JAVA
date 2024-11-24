public class SearchingStringMethods {
    public static void main(String[] args) {
        String fullName = "Bidhit Kumar";

        //indexOf(String str): Finds the first occurrence of a string.
        System.out.println("First occurrence of " + fullName + " = " + fullName.indexOf("i"));

        //lastIndexOf(String str): Finds the last occurrence of a string.
        System.out.println("Last occurrence of " + fullName + " = " + fullName.lastIndexOf("i"));

        //contains(CharSequence s): Checks if a string contains another string.
        System.out.println("Checks if a string contains " + fullName + " = " + fullName.contains("Bidhit"));

    }
}
