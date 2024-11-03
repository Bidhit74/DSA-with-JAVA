public class FunctionOverloading {
        // Overloaded method with two int parameters
        public static int add(int a, int b) {
            return a + b;
        }

        // Overloaded method with three int parameters
        public static int add(int a, int b, int c) {
            return a + b + c;
        }

        // Overloaded method with double parameters
        public static double add(double a, double b) {
            return a + b;
        }

        public static void main(String[] args) {

            // Calling different overloaded methods
            System.out.println("Sum of two integers: " + add(5, 10)); // Calls add(int, int)
            System.out.println("Sum of three integers: " + add(5, 10, 15)); // Calls add(int, int, int)
            System.out.println("Sum of two doubles: " + add(5.5, 10.5)); // Calls add(double, double)
        }
}
