public class invertedStar {
    public static void main(String[] args) {
        //Q:-2  Print Inverted Star Pattern 
        /*
            * * * * *
            * * * *
            * * *
            * *
            *
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
