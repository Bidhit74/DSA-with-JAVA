import java.util.*;
public class sumOfFirstN {
    public static void main(String[] args) {
        // Q: print sum of first n natural numbers
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want to sum ");
        int num = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("sum of first "+ num +" natural numbers ::- " + sum);
        s.close();
    }
}
