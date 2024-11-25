public class StringFunCompare {
    public static void main(String[] args) {
        String s1 = "BIDHIT";
        String s2 = "BIDHIT";
        String s3 = new String("BIDHIT");

        if (s1 == s2) {
            System.out.println("String are equal");
        } 
        else{
            System.out.println("String are not equal");
        }
        if (s1 == s3) {
            System.out.println("String are equal");
        } 
        else {
            System.out.println("String are not equal");
        }
        // Agar value equal check 
        if (s1.equals(s3)) {
            System.out.println("String are equal");
        } 
        else{
            System.out.println("String are not equal");
        }

    }
}
