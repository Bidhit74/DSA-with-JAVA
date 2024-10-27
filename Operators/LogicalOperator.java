package Operators;

public class LogicalOperator {
    public static void main(String[] args) {
        //&&, ||, !
        
        // Logical AND (&&)
        /* 
        System.out.println((2>5) && (10>5)); // false AND true --> false 
        System.out.println((2>5) && (10<5)); // false AND false --> false 
        System.out.println((2<5) && (10>5)); // true AND true --> true 
        System.out.println((2 < 5) && (10 < 5)); // true AND false --> false 
        */
        //Logical OR (||)
        /* 
        System.out.println((2>5) || (10>5)); // false AND true --> true 
        System.out.println((2>5) || (10<5)); // false AND false --> false 
        System.out.println((2<5) || (10>5)); // true AND true --> true 
        System.out.println((2 < 5) || (10 < 5)); // true AND false --> true
        */
        
        //Logical NOT(!)
        System.out.println(!(2<5)); // !true --> false
        System.out.println(!(2>5)); // !false --> true
    }
}
