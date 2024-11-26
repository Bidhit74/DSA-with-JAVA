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

# Modifying Strings

1.  -   replace(char oldChar, char newChar): Replaces all occurrences of a character.
2.  -   replaceAll(String regex, String replacement): Replaces using regex.
3.  -   replaceFirst(String regex, String replacement): Replaces the first match using regex.
        System.out.println("java".replace('a', 'o')); // "jovo"

4.  -   trim(): Removes leading and trailing spaces.
5.  -   strip(): Removes leading and trailing spaces (Unicode-aware). Unlike trim(), it also removes Unicode spaces.
        System.out.println(" hello ".trim()); // "hello"

# Newer methods like strip(), isBlank(), etc., are introduced in Java 11.

# Utility Methods

1.  -   split(String regex): Splits a string into an array based on a regex.
2.  -   split(String regex, int limit): Splits with a limit on the number of substrings.
        If limit > 0: Returns at most limit substrings.
        If limit = 0: Removes trailing empty strings but splits all others.
        If limit < 0: Splits all possible substrings without removing any.
        String[] parts = "a,b,c".split(",");

3.  -   toCharArray(): Converts a string into a character array.
        char[] chars = "hello".toCharArray();

4.  -   isEmpty(): Checks if a string is empty.
        System.out.println("".isEmpty()); // true

5.  -   isBlank(): Checks if the string is blank (ignores whitespace).
        String str3 = " ";
        System.out.println("IsBlank: " + str3.isBlank()); // true

6.  -   concat(String str): Concatenates the specified string.
        String str2 = "apple";
        System.out.println(str2.concat(" pie")); // "apple pie"

7.  -   String.join(CharSequence delimiter, String... elements): Joins multiple strings using a specified delimiter.
        System.out.println (String.join(", ", "apple", "banana", "cherry")); // "apple, banana, cherry"

# intern():

-   Helps save memory by reusing identical string values in the String Pool.

-   -   intern(); - usage:
        String str1 = new String("hello");
        String str2 = "hello";
        String str3 = str1.intern();

        System.out.println(str1 == str2); // false (different references)
        System.out.println(str2 == str3); // true (same reference from String Pool)

-   Time Complexity: The intern() method has a time complexity of O(1) on average for checking the string pool.

# StringBuffer:

-   StringBuffer is a mutable sequence of characters. It allows modifications to a string without creating a new string object, making it more efficient than String for frequent modifications.

1. Key Features:

    1. Mutability: Unlike String, which is immutable, StringBuffer objects can be modified.

    2. Performance: It is more efficient than String when performing multiple modifications (like append(), insert(), etc.), because it doesn't create a new object every time.

    3. Thread-Safety: StringBuffer is synchronized, meaning it is thread-safe. However, if thread-safety is not required, StringBuilder (which is not synchronized) can be used for better performance.

-   Provides a mutable, efficient way to modify strings, especially for cases requiring frequent modifications.

-   -   Usage :
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb); // Output: "Hello World"

1. Time Complexity:
   The time complexity for common operations is:
   append() → O(1) (amortized)
   insert() → O(n)
   delete() → O(n)
   reverse() → O(n)

-   These operations are much faster compared to creating new String objects due to StringBuffer's mutability.

# StringBuffer vs StringBuilder (In Short):

1.  Thread Safety:

    1. StringBuffer: Thread-safe (synchronized).

    2. StringBuilder: Not thread-safe (not synchronized).

2.  Performance:

    1.  StringBuffer: Slower due to synchronization overhead.

    2.  StringBuilder: Faster in single-threaded applications.

3.  Usage:

    1. StringBuffer: Use when thread safety is needed.

    2. StringBuilder: Use when thread safety is not needed for better performance.

4.  Methods: Both have the same methods (e.g., append(), insert(), etc.).
