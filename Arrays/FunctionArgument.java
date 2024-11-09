public class FunctionArgument {

    public static void update(int[] marks, int nochange) {
        nochange = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    public static void main(String[] args) {
        int nochange = 5;
        int[] marks = { 5, 10, 20 };
        update(marks, nochange); // array pass by reference hota esiliye yah original data ko change kar deta
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println("\n" + nochange); // no change pass by value
    }
}
