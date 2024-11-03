import java.util.*;
public class FactorialN {

    public static double factorialFunc(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value you want to factorial");
        int n = s.nextInt();
        System.out.println("Factorial of  " + n + "! = " + factorialFunc(n));
        s.close();
    }
}
