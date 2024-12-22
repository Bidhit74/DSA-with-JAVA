# Types of Access Modifiers:

-   Modifier -- Class -- Package -- Subclass -- World (Other Packages)
-   public -- ✔ -- ✔ -- ✔ -- ✔
-   protected -- ✔ -- ✔ -- ✔ -- ✘ (only via inheritance)
-   default -- ✔ -- ✔ -- ✘ -- -- ✘
-   private -- ✔ -- ✘ -- ✘ -- ✘

-   public: Access from anywhere.
-   protected: Access within package + subclasses.
-   default: Access within the same package.
-   private: Access only within the class.

# Copy Constructors:-

    A copy constructor is used to create a new object as a copy of an existing object.

-   Shallow Copy: Only references of objects are copied.

-   Deep Copy: New instances of referenced objects are created.

# Inheritance:

    Creating a new class (child) that inherits properties and methods from an existing class (parent) using the extends keyword.

1.  -   Single Level Inheritance, a class inherits from a single parent class, reusing its properties and methods.

2.  -   Multi-Level Inheritance: A class inherits from another class, which in turn inherits from a third class, forming a chain.

3.  -   Hierarchical Inheritance is a type of inheritance in Java where multiple subclasses inherit from a single parent class.

4.  -   Hybrid Inheritance is a combination of two or more types of inheritance in Java. Since Java does not support multiple inheritance directly (to avoid ambiguity), hybrid inheritance can only be achieved using a combination of classes and interfaces.
