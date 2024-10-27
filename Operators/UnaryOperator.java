package Operators;

public class UnaryOperator {
    public static void main(String[] args) {
        int A = 10;
        int B = 10;

        //Increament Operations
        System.out.println("A++ " + A++); //Postfix
        System.out.println("++A " + ++A); //Prefix
        //Decrement Operations
        System.out.println("B++ " + B++); //Postfix
        System.out.println("++B " + ++B); //Prefix
    }
}
