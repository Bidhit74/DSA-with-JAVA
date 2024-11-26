public class String_Builder {
    //StringBuilder Java me ek mutable class hai jo strings ko modify karne ke liye use hoti hai, bina har baar naya object banaye. Ye frequent changes ke liye String se zyada fast hota hai.

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        // Time complexity :- O(26) --> o(n)
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            // sb.append(ch);
            sb.append(ch + " ");
        }
        System.out.println(sb);
        
    }
}
