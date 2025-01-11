import java.io.FileNotFoundException;
// import java.io.FileReader;

public class ThrowException {
    public static void main(String[] args) throws FileNotFoundException {
        // method2();
        name();
    }
    
    // public static void method2() throws FileNotFoundException {
    //     method1();
    // }

    /* 
    public static void method1() throws FileNotFoundException {
        try {
            FileReader file = new FileReader("a.text");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            // forcefully throw exception
            throw new FileNotFoundException("File not found");
        }
    }
        */
    
    public static void name() {
        // Unchecked exception 
        throw new ArithmeticException();
        // Checked exception
        // throw new Exception("Unchecked exception"); // this is handled with throws keyword in method signature 
    }
}
