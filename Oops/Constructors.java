public class Constructors{
    public static void main(String[] args) {
        Student s1 = new Student("Bidhit");
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int roll;

    // This is Default constructor
    /*
    Student() {

    }
     */
    
    // This is custom constructor
    /* 
    Student() {
        System.out.println("Constructors are called...");
    }
     */

    // Intialize constructor with parameters
    Student(String name) {
        this.name = name;
    }
}