public class CheckPalindrome {
    // Question :- Check if a String is a Palindrome.
    // Example : "racecar" , "noon" , "madam"

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";

        if (isPalindrome(str)) {
            System.out.println("This String : " + str + " is a palindrome.");
        }
        else {
            System.out.println("This String : " + str + " is not a palindrome.");
        }
    }
}
