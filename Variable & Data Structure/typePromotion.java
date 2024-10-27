public class typePromotion {
    public static void main(String[] arngs) {
        // char a = 'a';
        // char b = 'b';
        // char c = b - a; // this is not possible kuyki "int" ko char me nahi store kar sakte hai
        // System.out.println((int) (a));
        // System.out.println((int) (b));
        // System.out.println(b - a); // type promotion only expression/oprator ke sath hota hai
        // System.out.println(a);

        // short a = 5;
        // byte b = 10;
        // char c = 'c';
        // byte ans= a+b+c; // this is not possible
        // byte ans= (byte) (a+b+c); // this is lossy value conversion
        // int ans = a+ b+ c;
        // System.out.println(ans);

        // int a = 10;
        // float b = 15.5f;
        // long c = 20;
        // double d = 25;
        
        // double ans = a + b + c + d;
        // System.out.println(ans);

        // This Statement Wrong -
        // byte a = 10;
        // byte b = a * 2;
        // or
        // a = a * 2; //  Kuy ki yaha expression work kiya gaya hai esiliye yah "a" ko int bana dega 
        // System.out.println(a);
        // System.out.println(b);

        // This Statement Right
        byte a = 10;
        byte b = (byte) (a * 2);
        // or
        a = (byte) (a * 2); //  Kuy ki yaha expression work kiya gaya hai esiliye yah "a" ko int bana dega 
        System.out.println(a);
        System.out.println(b);
    }
}
