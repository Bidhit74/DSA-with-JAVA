import java.util.Scanner;

public class LargestOf3Number {
    public static void main(String[] args) {
        //Q:- Print the largest of three numbers
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int output;
        if (a > b && a > c) {
            output = a;
        }
        else if (a < b && b > c) {
            output = b;
        }
        else {
            output = c;
        }
        System.out.println("Largest "+ output);
        s.close();
    }
}
