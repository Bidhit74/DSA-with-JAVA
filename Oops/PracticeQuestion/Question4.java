public class Question4 {
    public static void main(String[] args) {
        Test t = new Test();
        t.setMarks(50);
        System.out.println(Test.marks);
    }
}

class Test {
    static int marks;

    void setMarks(int marks) {
        // this.marks = marks; // Using 'this' to refer to the instance variable
        
        // Both are correct but Test.marks is best . marks is static variable 
        
        Test.marks = marks; // Using the class name to refer to the static field
    }
}
