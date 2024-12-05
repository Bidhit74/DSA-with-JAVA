public class Constructors{
    public static void main(String[] args) {
        // This is Constructor Overloading
        Student s1 = new Student();
        Student s2 = new Student(123);
        Student s3 = new Student("Bidhit");
        System.out.println(s2.roll);
        System.out.println(s3.name);
        System.out.println(s1); // answer Student with  hexadecimal.
    }
}

class Student {
    String name;
    int roll;

    // This is Default constructor
    // Student() {

    // }
    
    // This is Non - parameterized constructor
    Student() {
        System.out.println("Constructors are called...");
    }

    // This is Parameterized constructor
    Student(String name) {
        this.name = name;
    }
    Student(int roll) {
        this.roll = roll;
    }
}