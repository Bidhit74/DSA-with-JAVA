// Problem 12 --> Remove Duplicates in a String. (Google, Microsoft)
// Input :- naavnnniiit
// Output :- navnit

public class DuplicatesString {

    // This code only works small latter characters
    // Time and Space Complexity :- O(n)
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        // Base case: If we have processed all characters in the string, print the result and return
        if (idx == str.length()) {
            System.out.println(newStr); // Print the string without duplicates
            return;
        }
    
        // Get the current character at the given index
        char currentChar = str.charAt(idx);
    
        // Check if the character has already been added (i.e., it's a duplicate)
        if (map[currentChar - 'a'] == true) {
            // Skip the duplicate character and proceed to the next character
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            // Mark the character as seen
            map[currentChar - 'a'] = true;
    
            // Add the current character to the new string and process the next character
            removeDuplicates(str, idx + 1, newStr.append(currentChar), map);
        }
    }
    
    public static void main(String[] args) {
        String str = "naaavnnivit";
        removeDuplicates(str, 0,new StringBuilder(""), new boolean[26]);
    }
}
