# Encapsulation:

-   Wrapping data (fields) and methods (functions) in a single unit (class) and using access modifiers (private, public) to protect data. It also implements data hiding.

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

# Polymorphism

1. Compile Time Polymorphism ( Method Overloading )

    - Achieved when multiple methods in the same class share the same name but differ in the number or type of parameters.
    - Resolved during compile time.

2. Run Time Polymorphism ( Method Overriding )

    - Achieved when a subclass provides a specific implementation of a method already defined in its parent class.
    - Resolved during runtime using dynamic method dispatch.

# Abstraction:

-   Hiding implementation details using abstract classes (abstract keyword) or interfaces.

1. Abstract Class

-   -   Cannot create an instance/object of abstract class.
-   -   Can have abstraction – abstract methods.
-   -   Can have constructors

2. Interfaces

-   -   Interface is a blueprint of a class.
-   -   Interfaces are used to achieve multiple inheritance in Java.
-   -   Interface is used to achieve total abstraction.
-   -   All method are public, abstract & without implementation.
-   -   Variables in the interface are final, public and static.
-   -   Interfaces are implemented using the implements keyword
