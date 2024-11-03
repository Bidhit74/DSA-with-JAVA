import java.util.*;
public class RangeOfPrime {
    public static boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void rangeOfPrime(int n) {
        System.out.print("( ");
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
                System.out.print(i+ ", ");
            }
        }
        System.out.print(")");
        System.out.println("\nTotal Number of Prime = " + count);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n = s.nextInt();
        System.out.println("Print the range of prime");
        rangeOfPrime(n);
        s.close();
    }
}