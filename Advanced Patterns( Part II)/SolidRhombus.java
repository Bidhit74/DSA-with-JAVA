public class SolidRhombus {
    // SOLID RHOMBUS pattern
    //     *****
    //    *****
    //   *****
    //  *****
    // *****

    public static void solidRhombus(int n) {
        
        for (int i = 1; i <=n ; i++) {
            // Space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //Star
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solidRhombus(15);
    }
}
