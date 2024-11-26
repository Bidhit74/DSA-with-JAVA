public class StringCompression {
    // String compression
    // "aaabbbcccddddeee"   || "abc"
    // Output : "a3b3c3d4e3"  || "abc"

    // Time and Space Complexity :- O(n);
    public static String stringCompression(String compression) {
        StringBuilder sb = new StringBuilder();
        int n = compression.length();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < (n-1) && compression.charAt(i) == compression.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(compression.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String compression = "aaabbbcccddddeee";
        System.out.println(stringCompression(compression));
        System.out.println(stringCompression("abcd")); 
        System.out.println(stringCompression("aabbccaa")); 
    }
}
