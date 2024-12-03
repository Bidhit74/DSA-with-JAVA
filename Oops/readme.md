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
