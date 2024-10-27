package Operators;

public class RelationalOperator {
    public static void main(String[] args) {
        //==, !=, >, <, >=, <=
        int a = 15;
        int b = 10;

        System.out.println(a + " == " + b + " :--> " + (a==b)); //false
        System.out.println(a + " != " + b + " :--> " + (a!=b)); // true
        System.out.println(a + " <= " + b + " :--> " + (a<=b)); // false
        System.out.println(a + " >= " + b + " :--> " + (a>=b)); // true
        System.out.println(a + " > " + b + " :--> " + (a>b)); // true
        System.out.println(a + " < " + b + " :--> " + (a<b)); // false
    }
}
