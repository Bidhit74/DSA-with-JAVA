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
        for (int i = 0; i < numerator.length; i++) {
            int result = divide(numerator[i], denominator[i]);
            System.out.println(result);
        }
        System.out.println("Good Job!");
    }
}
