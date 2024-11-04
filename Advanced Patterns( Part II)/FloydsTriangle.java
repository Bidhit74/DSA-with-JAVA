public class FloydsTriangle {
    // FLOYD'S Triangle Pattern
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15

    public static void floydsTriangle(int n) {
        int num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                num++;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydsTriangle(5);
    }
}