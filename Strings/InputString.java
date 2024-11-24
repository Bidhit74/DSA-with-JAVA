import java.util.Scanner;
public class InputString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // String name = s.next(); // single string store
        String fullName = s.nextLine(); // Multiple strings store
        // System.out.println(name);
        System.out.println(fullName);
        System.out.println("Length of String " + fullName.length());
        s.close();
    }
}