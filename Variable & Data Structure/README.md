# Java Basics

-   System.out.print() - prints without adding a new line.
-   System.out.println() - prints and moves to the next line.

# Variables

-   5+(a+b)
-   This is 5 is literal or constant jo universal hota hai change nahi hota hai
-   "a+b" is a variable jiski value change ho sakti hai

# Data Types in Java

1. Primitive Data Types:
   byte: - 1 byte, stores whole numbers from -128 to 127.
   short: - 2 bytes, stores whole numbers from -32,768 to 32,767.
   int: - 4 bytes, stores whole numbers from -2^31 to 2^31-1.
   long: - 8 bytes, stores whole numbers from -2^63 to 2^63-1.
   float: - 4 bytes, stores fractional numbers (single precision).
   double: - 8 bytes, stores fractional numbers (double precision).
   char: - 2 bytes, stores a single character/letter (e.g., 'a', 'A').
   boolean:- 1 bit, stores either true or false.

2. Reference or Non-Primitive Data Types :
   String: Used to store a sequence of characters.
   Arrays: Used to store multiple values of the same type.
   Classes: Custom data types created by the user.
   Object: The Object data type in Java is the parent of all classes. It can store any type of object, and all Java classes inherit from it.
   Interfaces: Used to specify what a class must do, but not how.

# Input in Java

-   -   -   next , nextLine , nextInt , nextLong , nextByte , nextDouble , nextFloat , nextShort , etc...

-   Using Scanner class:
-   -   Import: import java.util.Scanner;
        Example:
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // For integer input
        String str = sc.nextLine(); // For string input
        float f = sc.nextFloat(); // For float input
-   Different between "import java.util.Scanner;" or "import java.util."

1. import java.util.Scanner;
   \*Imports only Scanner.
   \*It is specific and more efficient because you are only importing the class you need.
2. import java.util.\*;
   \*Imports all classes in java.util
   \*It is broader and less efficient because you are importing more than needed, even if you use just one class.

# Java Important Concept:

1. In Java, float can accept decimal numbers, but they must be specified as
   float literals by adding an f or F suffix. By default, decimal numbers are treated as double, a higher-precision type, which can’t be directly assigned to float without an explicit cast or suffix.

    - Example:

    1. float value = 3.14f; // Explicitly declares 3.14 as a float
    2. float value = (float) 3.14; // Casts 3.14 to a float

# Type conversion

-   Conversion happens in when:
    a. type compatible
    b. destination type > source type

-   byte -> short -> int -> float -> long -> dubble
    This conversion is One directional

# Type Promotion in Expression

-   Rules:

    1. All byte, short, and char values are promoted to int in arithmetic expressions.

    2. If an operand is long, the whole expression is promoted to long.

    3. If one operand is float, the expression is promoted to float.
    4. If one operand is double, the expression is promoted to double.
