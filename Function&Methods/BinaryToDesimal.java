import java.util.*;
public class BinaryToDesimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p = 0;
        System.out.println("Convert Binary to decimal. Please enter Binary number" );
        int B = s.nextInt();
        double D = 0;
        while (B > 0) {
            int LD = B % 10;
            D = D + LD * Math.pow(2, p);
            B /= 10;
            p++;
        }
        System.out.println("Convert Binary to Desimal = " + D);
        s.close();
    }
}
