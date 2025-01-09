public class WrapperClasses {
    public static void main(String[] args) {
        int a = 1; // this is primitive value
        // Integer b = 1; // this is int wrap value // wrap value hold null value
        // boolean hssGraphicCard = true; // this is primitive value
        // Boolean isAdult = true; // this is boolean wrap value
        // Float f = 1.0f; //
        // Double d = 1.3;
        // Character c = 'A';
        // Byte bb = 1;
        // Short s = 2;
        // Long l = 123l;

        System.out.println(a);

        // Autoboxing: Automatic conversion of a primitive type into its wrapper class object.
        int num = 10;
        Integer obj = num; // Autoboxing: int to Integer
        System.out.println(obj);
        // Unboxing: Automatic conversion of a wrapper class object back into its corresponding primitive type.
        Integer obj1 = 20;
        int num1 = obj1; // Unboxing: Integer to int
        System.out.println(num1);
   
        
    }
}
