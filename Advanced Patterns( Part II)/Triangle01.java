public class Triangle01 {
    // 0-1 Triangle pattern
    // 1 
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1
    public static void triangle01(int n) {
        for (int i = 0; i < n; i++) {
            int binary = (i%2 == 0) ? 1 : 0; // Start with 1 for even rows, 0 for odd rows
            for (int j = 0; j <= i; j++) {
                System.out.print(binary + " ");
                binary = 1 - binary; // Toggle between 1 and 0
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle01(5);
    }
}
