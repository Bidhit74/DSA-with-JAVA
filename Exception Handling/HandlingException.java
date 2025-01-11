public class HandlingException {
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero : " + e);
            return -1;
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] numerator = { 10, 200, 30, 40 };
        int[] denominator = { 2, 0, 5, 4 };
        for (int i = 0; i < 5; i++) {
            try {
                int result = divide(numerator[i], denominator[i]);
                System.out.println("Result: " + result);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array index out of bound : " + e);
            }
            // Jab upper wala eceptions nahi rahega koi other exceptions rahega tab yah catch block chalega 
            catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        System.out.println("Good Job!");
    }
}
