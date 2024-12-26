# Recursion

-   Recursion is a programming technique where a function calls itself to solve a problem by breaking it into smaller subproblems.

# Key Concepts:

-   • Base Case: Stops recursion to prevent infinite loops.
-   • Recursive Case: The function calls itself with modified arguments.

# Types of Recursion:

1. Top-down Recursion (Pre-order):

-   -   The function breaks the problem into subproblems, moving deeper before returning values.

2. Bottom-up Recursion (Post-order):

-   -   The function starts from the base case and works back up, combining the results of subproblems as it unwinds to form the final solution.

-   -   Both approaches divide and conquer the problem, but their execution order differs.

# Call Stack

-   -   The call stack is a data structure that tracks function calls in a program.

1.  - It stores information like local variables, parameters, and return addresses.
2.  - It operates in a Last In, First Out (LIFO) order, where the last called function is the first to return.
3.  - When a function finishes, its frame is removed from the stack.

# Stack Overflow in Recursion

-   -   When a recursive function repeatedly calls itself without a proper base case or has too many nested calls, the program's call stack exceeds its memory limit, causing a "stack overflow" error.
