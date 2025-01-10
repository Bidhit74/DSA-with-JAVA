// import myworkpackage.Work1;
// import myworkpackage.Work2;
// import myworkpackage.Work3;
// import myworkpackage.operations.MathOperations;

// or

import myworkpackage.*;
import myworkpackage.operations.*;;

public class PackagesRun {
    public static void main(String[] args) {
        Work1 work1 = new Work1();
        work1.displayWork1();

        Work2 work2 = new Work2();
        work2.displayWork2();

        Work3 work3 = new Work3();
        work3.displayWork3();

        MathOperations op = new MathOperations();
        System.out.println("Addition: " + op.add(10, 20));
        System.out.println("Subtraction: " + op.subtract(20, 10));

    }
}

