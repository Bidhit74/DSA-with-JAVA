public class Question5 {
    public static void main(String[] args) {
        // Test t = new Test();
        // t.changeB();
        Test.changeB();  // Correct way to call a static method
        System.out.println(Test.a + Test.b); // 50
    }
}

class Test {
    static int a = 10;
    static int b;
    
    static void changeB() {
        b = a * 4; 
    }
}
