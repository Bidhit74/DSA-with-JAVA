public class CopyConstructors {
    //Copy Constructors:- A copy constructor is used to create a new object as a copy of an existing object.

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Bidhit";
        s1.roll = 74888;
        s1.marks[0] = 95;
        s1.marks[1] = 88;
        s1.marks[2] = 80;
        Student s2 = new Student(s1);
        s2.marks[0] = 88;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        
    }
}

class Student {
    String name;
    int roll;
    int marks[];

    // Copy Constructors
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    //Default constructor
    Student() {
        marks = new int[3]; // Initialize the array
        System.out.println("Default constructor called...!");
    }

}