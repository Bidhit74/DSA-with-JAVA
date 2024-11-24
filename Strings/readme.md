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
