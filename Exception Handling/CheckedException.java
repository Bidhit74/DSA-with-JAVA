import java.io.FileNotFoundException;
import java.io.FileReader;
// import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        // Exception is a checked exception, so we need to handle it.
        /* 
        try {
            FileReader file = new FileReader("a.text");
        }
        catch(IOException e) {
            System.out.println(e);
        } 
        catch (Exception e) {
            System.out.println("Exception caught in main method :- " + e);
        }
            */
            method2();
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }
    public static void method1() throws FileNotFoundException {
        FileReader file = new FileReader("a.text");
    }
}
