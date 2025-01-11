import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        // Exception is a checked exception, so we need to handle it.
        try {
            FileReader file = new FileReader("a.text");
        }
        catch(IOException e) {
            System.out.println(e);
        } 
        catch (Exception e) {
            System.out.println("Exception caught in main method :- " + e);
        }
    }
}
