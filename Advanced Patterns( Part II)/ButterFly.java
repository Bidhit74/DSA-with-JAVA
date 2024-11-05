public class ButterFly {
    // ButterFly Pattern
    // *             *
    // * *         * *
    // * * *     * * *
    // * * * * * * * *
    // * * * * * * * *
    // * * *     * * * 
    // * *         * * 
    // *             *

    /* 
    public static void butterFly(int n) {
        for (int i = 1; i <= n; i++) {
            //Star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //Star and Space
            for (int j = 1; j <= n; j++) {
                if (j >= n - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    
        for (int i = 1; i <= n; i++) {
            //Star
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            // Star and Space
            for (int j = 1; j <= n; j++) {
                if (j < i) {
                    System.out.print("    ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    */
    
    //By avoiding if-else, the optimized code simplifies the logic, makes it easier to understand, and can run slightly faster for larger inputs due to fewer condition evaluations.
    //Better way code
    public static void butterFly(int n) {
        // Upper part of the butterfly
        for (int i = 1; i <= n; i++) {
            //Left Star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Space
            for (int j = 1; j <= 2*(n - i); j++) {
                System.out.print("  ");
            }
            //Right Star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
         // Lower part of the butterfly
        for (int i = n; i >= 1; i--) {
            //Left Star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Space
            for (int j = 1; j <= 2*(n - i); j++) {
                System.out.print("  ");
            }
            //Right Star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        butterFly(9);
    }
}
