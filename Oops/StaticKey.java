//Static Keyword :-  static keyword in java is used to share the same variable or method of a given class. It can be applied to variables, properties, methods/functions, blocks, and nested classes.

// Static Keyword :- use karne se multiple variables or functions nahi banta hamre memory static use karne single memory space use karta jis se agar kahi pe koi static variable change hota to har jagah refelect hota hai

public class StaticKey {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Bidhit");
        System.out.println(s1.getName());
        Student.schoolName = "LPU"; // Assigning the static variable 'schoolName'

         // Calling a static method to calculate the percentage
         System.out.println(Student.calculatePercentage(60, 80, 70)); // Prints the average of marks
         System.out.println(Student.calculatePercentage(70, 90, 70)); // Prints the average of marks

        Student s2 = new Student();
        s2.setName("Binit");
        System.out.println(s2.getName());
        Student.schoolName = "LNMU"; // Changing the static variable 'schoolName'
        // Static variable reflects the last updated value for all objects

        /* 
        System.out.println(s2.schoolName); // Prints "LNMU"
        System.out.println(s1.schoolName); // Also prints "LNMU" due to static behavior
        */

        //static members belong to the class, not to individual objects.
        //Using the class name (Student.schoolName) makes it clear that the variable is shared across all instances.

        System.out.println(Student.schoolName);
        System.out.println(Student.schoolName);
    }
}

class Student {
    String name; // Instance variable to store the student's name
    int roll; // Instance variable to store the student's roll number

    // Static method to calculate the percentage of marks
    static int calculatePercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3; // Returns the average of the three marks
    }

    static String schoolName; // Static variable shared among all objects of the class

    // Getter method to retrieve the name of the student
    String getName() {
        return this.name;
    }

    // Setter method to assign the name of the student
    void setName(String name) {
        this.name = name;
    }
}


