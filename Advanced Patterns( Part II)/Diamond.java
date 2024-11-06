public class Diamond {
    // DIAMOND pattern
    //    * 
    //   *** 
    //  ***** 
    // ******* 
    // ******* 
    //  ***** 
    //   *** 
    //    * 

    /*
    public static void DiamondPattern(int n) {
        //First Half of the pattern
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j < (2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Second Half of the pattern
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j <= (n*2)-(2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    */

    //Similar code minor changes
    public static void DiamondPattern(int n) {
        //First Half of the pattern
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j < (2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Second Half of the pattern
        for (int i = n; i >= 1; i--) {
            // space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j < (2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DiamondPattern(10);
    }
}