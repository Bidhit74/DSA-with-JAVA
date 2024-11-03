public class CallByValue {

    public static void swapValue(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
    public static void main(String[] args) {
        //swap - values exchange
        int a = 5;
        int b = 10;

        //swap
        swapValue(a, b); // this is not affeted original value . kuyki this is calls "call by value" copy the original value

        System.out.println("Function call after");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}