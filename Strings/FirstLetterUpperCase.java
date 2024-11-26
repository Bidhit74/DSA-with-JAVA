public class FirstLetterUpperCase {
    // Question :-  For a given String convert each the first letter to each word to uppercase.
    // Example : str = "hi, i am bidhit";
    // Output : "Hi, I Am Bidhit";

    // Time complexity : O(n)  Space complexity : O(n)
    public static String firstLetterUpperCase(String str) {
        if (str == null || str.isEmpty()) {
            return ""; // Handle null or empty strings
        }
        StringBuilder sb = new StringBuilder("");
        int n = str.length();
        char ch = Character.toUpperCase(str.charAt(0)); // Capitalize the first character
        sb.append(ch);
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) == ' ') {
                sb.append(str.charAt(i)); // Append the space
                if (i + 1 < n && str.charAt(i + 1) != ' ') { // Check for next valid character
                    sb.append(Character.toUpperCase(str.charAt(i + 1))); // Capitalize
                    i++;
                }
            } else {
                sb.append(str.charAt(i)); // Append the current character
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am bidhit";
        System.out.println(firstLetterUpperCase(str));
        System.out.println(firstLetterUpperCase(" java programming "));
        System.out.println(firstLetterUpperCase("")); 
        System.out.println(firstLetterUpperCase(null));     
    }
}
