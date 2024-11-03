import java.util.*;;

public class BinomialCoefficient {
    //C(n,k) ==  n! / k! (n-k)!
    /* 
    Key Points:
        n: Total number of items.
        k: Number of items to choose.
        0≤k≤n.
    */
    public static double factorialFunc(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static double binomialCoefficient(int n, int k) {
        int coeffi = n - k;
        double result = factorialFunc(n) / (factorialFunc(k) * factorialFunc(coeffi));
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Binomial Calculator :: input Rule  ===>  0 ≤ k ≤n");
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter value of N");
        int n = s.nextInt();
        System.out.println("Please enter value of K");
        int k = s.nextInt();

        System.out.println("Binomial Coefficient = "+binomialCoefficient(n, k));
        s.close();


    }
}
