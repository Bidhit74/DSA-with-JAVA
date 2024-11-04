import java.util.*;

public class DecimalToBinary {
    // public static String dicimalToBinary(int decimal) {
    //     String bi = " ";
    //     while (decimal > 0) {
    //         int bit = decimal % 2;
    //         bi = bit + bi;
    //         decimal /= 2;
    //     }
    //     return bi;
    // }
    
    public static long dicimalToBinary(int decimal) {
        long bi = 0;
        int p = 0;
        while (decimal > 0) {
            int bit = decimal % 2;
            bi = bi + (bit * (long) Math.pow(10, p));
            decimal /= 2;
            p++;
        }
        return bi;
    }
    
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Convert Decimal to Binary . Please enter Decimal number" );
        int D = s.nextInt();
        System.out.println("Convert Desimal -> "+ D  +" to Binary = " + dicimalToBinary(D));
        s.close();
    }
}
