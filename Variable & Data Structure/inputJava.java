import java.util.Scanner;
public class inputJava {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        // String input = s.next(); // single word/string input
        // System.out.println(input);
        // String inputName = s.nextLine(); // Multiple word/string input
        // System.out.println(inputName);

        //Add two numbers using user input
        /*
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = a + b;
        System.out.println(sum);
         */

        //Product of two numbers using user input
        /* 
        float a = s.nextFloat();
        float b = s.nextFloat();
        float mul = a * b;
        System.out.println(mul);
        */
        
        //Area of Circle
        System.out.println("Please enter a radius");
        float radius = s.nextFloat();
        float area = 22.0F/7 * (radius * radius); // The 'f' suffix indicates a float literal
        // float area = 3.14f * (radius * radius); // The 'f' suffix indicates a float literal
        // Java hamesh Desimal number ko dubble man leta hai esiliye hame agar float me value chahiye tho suffix "f" or "F" ko add karna hoga ya explicit float banana hoga 
        System.out.println(area);
        s.close();
    }
}
