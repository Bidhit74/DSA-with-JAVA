public class BitwiseOperators {
    // Binary AND(&) operator
    // 1 & 1 = 1
    // 1 & 0 = 0
    // 0 & 1 = 0
    // 0 & 0 = 0
    // Binary AND operator Question
    // 5 & 6 --> 101 & 110 = 100 --> (4)

    // Binary OR(|)
    // 1 | 1 = 1
    // 1 | 0 = 1
    // 0 | 1 = 1
    // 0 | 0 = 0
    // Binary OR operator Question
    // 5 | 6 --> 101 | 110 = 111 --> (7)

    // Binary XOR(^)
    // 1 ^ 1 = 0
    // 1 ^ 0 = 1
    // 0 ^ 1 = 1
    // 0 ^ 0 = 0
    // Binary XOR operator Question
    // 5 ^ 6 --> 101 ^ 110 = 011 --> (3)

    public static void main(String[] args) {
        System.out.println(5 & 6); // Output is 4.
        System.out.println(5 | 6); // Output is 7.
        System.out.println(5 ^ 6); // Output is 3.
    }
}
