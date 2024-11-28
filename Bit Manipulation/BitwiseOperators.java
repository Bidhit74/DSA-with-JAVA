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

    // Binary One's complement (~) or (~) NOT operator
    // ~1 = 0
    // ~0 = 1
    // Binary One's complement (~) or Not Operator Question
    // Two term in this operator 
    //LSB(Least Significat Bit) --> (1)
    //MSB(Most Significat Bit) --> (0)
    // Tow's Complement --> First you need to one's complement than add 1. 
    // ~5 --> ~(0000...101) = 1111...010  --> number Negation (MSB = 1(Negative)) 
    //Two's complement
    // 1111...010 --> one's complement --> 0000...101 + 1 --> 0000...110 --> (6) But MSB(Negative) than answer is (-6)

    // Binary Leff Shift (<<)
    // Q :- 5 << 2   00000…101 Left shift (<<)  = 000..10100    16
	// Formula :-   a  <<  b  =  a *  2b 
	// 5 << 2  =  5 * 22  = 5 * 4 = 20 


    public static void main(String[] args) {
        System.out.println(5 & 6); // Output is 4.
        System.out.println(5 | 6); // Output is 7.
        System.out.println(5 ^ 6); // Output is 3.
        System.out.println(~5); // Output is -6.
        System.out.println(~0); // Output is -6.
        System.out.println(5 << 2); // Output is 20.
        System.out.println(5 << 5); // Output is 160.
    }
}
