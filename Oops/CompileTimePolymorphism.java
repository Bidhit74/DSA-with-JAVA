public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(5,15, 0)); // 20
        System.out.println(cal.sum((float)5.5 , (float)4.2)); // 9.7
        System.out.println(cal.sum(15,5,10)); // 30
    }
}

// Compile Time Polymorphism ( Method Overloading )
// - Achieved when multiple methods in the same class share the same name but differ in the number or type of parameters.
// - Resolved during compile time.

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}