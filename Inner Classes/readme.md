# inner classes

-   In Java, inner classes are classes defined within another class. It's a way to logically group classes that are only used in one place, increasing encapsulation and making code more readable and maintainable.

# Types of Inner Classes in Java

1. Member Inner Class (Non-Static Inner or Nested Inner Class) :- Defined inside a class but outside any method, constructor, or block. Can access all members (including private) of the outer class.

2. Static Nested Class:

-   -   A nested class declared with the static keyword.
-   -   Does not require an instance of the outer class to be created.
-   -   Can access only static members of the outer class directly.

3. Anonymous Inner Class

-   -   A class without a name that is declared and instantiated simultaneously.
-   -   Typically used to implement an interface or override methods of a class.
-   -   Commonly used for one-time use cases, such as event handling.

4. Local Inner Class:

-   -   A class defined within a method, constructor, or block.
-   -   Scope is limited to the block in which it is declared.
-   -   Can access variables of the enclosing method if they are final or effectively final.
