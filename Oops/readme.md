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
