public class CharacterPattern {
    public static void main(String[] args) {
        //Q:-4 Print character pattern
        /*
            A
            B C
            D E F
            G H I J
            K L M N O
         */
        int n = 5;
        char ch = 'A';
        for(int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
