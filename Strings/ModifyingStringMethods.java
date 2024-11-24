public class ModifyingStringMethods {
    public static void main(String[] args) {
        String fullName = "Bidhit Kumar";

        //replace(char oldChar, char newChar): Replaces all occurrences of a character.
        System.out.println("Replaces all occurrences " + fullName + " = " + fullName.replace("Bidhit Kumar", "Rahul Raj"));
        System.out.println("Replaces all occurrences " + fullName + " = " + fullName.replace("i", "ee"));

        String Name = "abc123 def456 ghi789";
        //replaceAll(String regex, String replacement): Replaces using regex.
        System.out.println("Replaces using regex: " + Name + " = " + Name.replaceAll("\\d", "-"));
        System.out.println("Replaces using regex: " + Name + " = " + Name.replaceAll("\\w", "+"));
        System.out.println("Replaces using regex: " + Name + " = " + Name.replaceAll("\\s", "-"));

        //replaceFirst(String regex, String replacement): Replaces the first match using regex.
        System.out.println("Replaces the first match using regex " + Name + " = " + Name.replaceFirst("\\s", "First"));

        String s = "  Hello  World  ";
        //trim(): Removes leading and trailing spaces.
        System.out.println("Removes leading and trailing spaces " + s + " = " + s.trim());

        //strip(): Removes leading and trailing spaces (Unicode-aware). Unlike trim(), it also removes Unicode spaces.
        System.out.println("Removes leading and trailing spaces (Unicode-aware) " + s + " = " + s.strip());

    }
}
