public class LocalInnerClass {
    public static void main(String[] args) {
        OuterClass obj1 = new OuterClass();
        obj1.m1(); // Invoking method with a local inner class
    }
}

// Class containing a method-local inner class
class OuterClass {
    int x = 1000; // Instance variable
    static int y = 2000; // Static variable

    public void m1() {
        // Local inner class defined within method m1
        class Inner {
            // Static variables/methods are not allowed in local inner classes
            public void m2() { // Method of the local inner class
                System.out.println("X = " + x); // Accessing instance variable
                System.out.println("Y = " + y); // Accessing static variable
            }
        }

        // Creating an instance of the local inner class
        Inner obj2 = new Inner();
        obj2.m2(); // Calling the method of the inner class
    }
}

// Note:
// Java does not allow method nesting directly.
// However, method nesting can be simulated using a local inner class.
