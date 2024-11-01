import java.util.*;
public class isPrime {
    public static void main(String[] args) {
        //Q: Check if a number is prime or not.
        Scanner s = new Scanner(System.in);
        System.out.println("Check if a number is prime or not. :: Enter the number ");
        int n = s.nextInt();
        boolean isPrime = true;
        /* Time Complexity :: n-1
        for (int i = 2; i <= n - 1; i++) {
            System.out.println("Hello " + i);
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        */
        // Time Complexity :: √n
        for (int i = 2; i <= Math.sqrt(n) - 1; i++) {
            System.out.println("Hello " + i);
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(n == 1 || n == 0 || n == 2 ){
            System.out.println(n + " is not a prime number.");
        }
        else if (isPrime) {
            System.out.println(n+" is a prime number.");
        }
        else {
            System.out.println(n + " is not a prime number.");
        }
        s.close();
    }
}
