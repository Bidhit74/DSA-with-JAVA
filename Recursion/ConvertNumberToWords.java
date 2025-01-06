// Question :- You are given a number (eg - 2019), convert in into a String of english like "two zero one nine". Use a recusive function to solve this problem.

// Note :- The digits of the number will be in the range 0-9 and the last digit of a number con't be 0.

public class ConvertNumberToWords {
    
    static String[] digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void printNumberToWords(int number) {
        // Base Case
        if (number == 0) {
            return;
        }
        int lastDigit = number % 10;
        printNumberToWords(number / 10);
        System.out.print(digits[lastDigit] + " ");
    }
    public static void main(String[] args) {
        int number = 2019;
        printNumberToWords(number);
        System.out.println();
        printNumberToWords(1947);
        System.out.println();
        printNumberToWords(205);
        System.out.println();
        printNumberToWords(234567);

    }
}
