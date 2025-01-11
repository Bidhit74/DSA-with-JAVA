public class HandlingException1 {
    public static void main(String[] args) {
        try{
        level1();
        }
        catch(Exception e){
            System.out.println("Exception caught in main method :- ");
            // printStackTrace will print the exception and the line number where it occured in the code that generated the exception.
            e.printStackTrace();
        }

    }
    
    public static void level3() {
        int[] arr = new int[5];
        arr[5] = 10;
    }
    public static void level2() {
        level3();
    }
    public static void level1() {
        level2();
    }


}
