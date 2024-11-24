public class ComparisonStringMethods {
    public static void main(String[] args) {
        String fullName = "Bidhit Kumar";

        //equals(String another): Checks if two strings are equal.
        System.out.println("Checks if two strings are equal :  " + fullName.equals("Bidhit Kumar") );

        //equalsIgnoreCase(String another): Compares strings ignoring case.
        System.out.println("Compares strings ignoring case: " + fullName.equalsIgnoreCase("bidhit kumar"));

        //compareTo(String another): Compares two strings lexicographically (alphabetically). Returns negative, zero, or positive values.
        System.out.println("Compares two strings lexicographically: " + fullName.compareTo("Bidhit"));
    }
}
