public class InvertedRotatedHalfPyramid {
    // INVERTED & ROTATED HALF-PYRAMID pattern
    //          *
    //        * *
    //      * * *
    //    * * * *
    //  * * * * *
    //Best Readability but performance wise Good
    // public static void invertedRotatedHalfPyramid(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         //space
    //         for (int j = 0; j < n - i; j++) {
    //             System.out.print("  ");
    //         }
    //         //star
    //         for (int j = 0; j < i; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }

    // }
    
    //Best optimization this code performance wise best but less readability
    public static void invertedRotatedHalfPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>0; j--){
                if(j<=i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedRotatedHalfPyramid(10);
    }
}
