public class FinallyKeyword {
    public static void main(String[] args) {
        divide(5, 0);
        divide(0, 5);
    }
    
    public static void divide(int a, int b) {
        try {
            int c = a/b;
            System.out.println("Divide: " + c);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}
