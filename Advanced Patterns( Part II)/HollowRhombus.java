public class HollowRhombus {
    // HOLLOW RHOMBUS pattern
    //     * * * * *
    //    *       *
    //   *       *
    //  *       *
    // * * * * *

    /* 
    // This code Good for readability
    public static void hollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //Hollow Star
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    */
    // Slightly Good code or both code good 
    public static void hollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //Hollow Star
            for (int j = 1; j <= n; j++) {
                System.out.print((i == 1 || i == n || j == 1 || j == n) ? "* " : "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRhombus(15);
    }
}
