public class checkOddEven{
    // Question 1 :-  Check if a number is O or Even
    // Solve : Logic --> Use AND(Operators) with one(1)
    // 5 & 1 = 101 & 001 = 001 = 1 --> Odd
    // 8 & 1 = 1000 & 0001 = 0000 = 0 --> Even

    public static void printCheckOddEven(int value) {
        if ((value & 1) == 0) {
            System.out.println(value + " :- Even");
        }
        else {
            System.out.println(value + " :- Odd");
        } 
    }

    public static void main(String[] args) {
        int n = 92;
        printCheckOddEven(n);
    }
}