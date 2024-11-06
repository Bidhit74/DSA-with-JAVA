public class Palindromic {
    // PALINDROMIC Pattern with Numbers pattern
    //     1
    //    212
    //   32123
    //  4321234
    // 543212345

    public static void PalindromicNumber(int n){
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // Left Side Number Pattern
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            // Right Side Number Pattern
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PalindromicNumber(9);
    }
}
