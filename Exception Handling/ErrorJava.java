public class ErrorJava {

    // Logical Error
    public static int add(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        // Syntax error
        // int a == 0; // Syntax error

        // Runtime error
        int a = 10 / 0; // ArithmeticException
        System.out.println(a);
        
    }
}