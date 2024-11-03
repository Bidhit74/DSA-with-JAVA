import java.util.*;

public class checkPrime {
    /* 
    Time Complexity -- n
    public static boolean checkPrime(int n) {
        if (n == 1 || n == 0){
            return false;
        }
        for (int i = 2; i < n-1; i++) {
            System.out.println("Checking " + i );
            if (n % i == 0) {
                return false;
            }
        }   
        return true;
    }
    */

    //Time Complexity -- √n
    public static boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(n); i++) {
            System.out.println("Checking " + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Check number is prime or not . Enter the number");
        int n = s.nextInt();
        if (isPrime(n)) {
            System.out.println("This number is a prime :-  " + n);
        } else {
            System.out.println("This number is not a prime :-  " + n);
        }
        s.close();
    }
}