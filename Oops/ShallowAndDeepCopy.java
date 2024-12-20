public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Bidhit";
        s1.roll = 1;
        s1.marks[0] = 85;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        System.out.println(s1.name);
        Student s2 = new Student(s1);
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

// Shallow Copy: Only references of objects are copied.
// Deep Copy: New instances of referenced objects are created.
class Student {
    String name; // Name of the student
    int roll;    // Roll number of the student
    int marks[]; // Array to store marks of the student in 3 subjects

    // Shallow Copy Constructor
    Student(Student s1) {
        marks = new int[3]; // Initialize the marks array
        this.name = s1.name; // Copy the reference of the name field
        this.roll = s1.roll; // Copy the roll number
        this.marks = s1.marks; // Copy the reference of the marks array (shallow copy)
    }

    
    // Deep Copy Constructor
    /*
    Student(Student s1) {
        marks = new int[3]; // Initialize the marks array
        this.name = s1.name; // Copy the reference of the name field
        this.roll = s1.roll; // Copy the roll number
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i]; // Copy each element of the marks array (deep copy)
        }
    }
    */

    // Default Constructor
    Student() {
        marks = new int[3]; // Initialize the marks array
        System.out.println("Default copy constructor called..."); // Inform when default constructor is used
    }
}
