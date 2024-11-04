import java.util.*;

public class BinaryToDecimal {
    
    public static double binaryToDecimal(int binary){
        int p = 0;
        double decimal = 0;
        while (binary > 0) {
            int LD = binary % 10;
            decimal = decimal + LD * Math.pow(2, p);
            binary /= 10;
            p++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Convert Binary to decimal. Please enter Binary number" );
        int binary = s.nextInt();
        System.out.println("Convert Binary to Desimal = " + binaryToDecimal(binary));
        s.close();
    }
}
