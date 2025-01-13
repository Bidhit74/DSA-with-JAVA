// Question :- Arithmetic Exception Handling
// Write a program that asks the user to enter two integers and then divide the first by the second. The program should handle any arithmetic exceptions that may occur(like division by zero) and display an appropriate message.

// Key Point
// Use Scanner to read user input.
// implement a try-catch block to handle ArithmeticException.
// Display a user-friendly message if division by zero occurs.

import java.util.Scanner;

public class ExceptionQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculator:");
        System.out.println("Enter first numbers:");
        int num1 = sc.nextInt();
        System.out.println("Enter second numbers:");
        int num2 = sc.nextInt();
        sc.close();
        try{
            int result = num1/num2;
            System.out.println("Result: "+ result);
        }
        catch (ArithmeticException e) {
            if (e.getMessage().equals("/ by zero")) {
                System.out.println("Division by zero is not allowed");
            } else {
                throw e;
            }
        }
    }
}
