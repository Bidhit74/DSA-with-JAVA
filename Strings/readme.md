# Most commonly used String methods in Java:

# Basic Operations

1.  -   length(): Returns the number of characters in the string.
        String str = "Hello";
        System.out.println(str.length()); // 5

2.  -   charAt(int index): Gets the character at the specified index.
        System.out.println(str.charAt(1)); // 'e'

3.  -   substring(int beginIndex)
        Returns a substring starting from the specified index.
        String str = "Hello World";
        System.out.println(str.substring(6)); // Output: World

4.  -   substring(int startIndex, int endIndex): Extracts part of the string.
        System.out.println(str.substring(1, 4)); // "ell"

# Case Conversion

1.  -   toUpperCase(): Converts all characters to uppercase.
2.  -   toLowerCase(): Converts all characters to lowercase.
        System.out.println(str.toUpperCase()); // "HELLO"

# Comparison

1.  -   equals(String another): Checks if two strings are equal.
        System.out.println("abc".equals("abc")); // true

2.  -   equalsIgnoreCase(String another): Compares strings ignoring case.
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

3.  -   compareTo(String another): Compares two strings lexicographically (alphabetically). Returns negative, zero, or positive values.
        System.out.println("abc".compareTo("abd")); // -1

# Searching

1.  -   indexOf(String str): Finds the first occurrence of a string.
        System.out.println("hello".indexOf("l")); // 2

2.  -   lastIndexOf(String str): Finds the last occurrence of a string.
        System.out.println("hello".lastIndexOf("l")); // 3

3.  -   contains(CharSequence s): Checks if a string contains another string.
        System.out.println("hello".contains("ell")); // true
