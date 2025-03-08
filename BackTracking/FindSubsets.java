// Find Subsets : find and print all subsets of given string.
// input = "abc"
// output = a, b, c, ab, bc, ac, abc

public class FindSubsets {

    //Time Complexity: O(2^n * n).
    //Space Complexity: O(n).
    public static void findSubset(String str, String ans, int idx) {
        // Base case:
        if (idx == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }        
        //Recursive case:
        //Yes Choice
        findSubset(str, ans + str.charAt(idx), idx + 1);
        //No Choice
        findSubset(str, ans, idx+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }
}
