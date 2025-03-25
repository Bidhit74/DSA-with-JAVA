// Find maximum in an ArrayList
// input : list = 2, 5, 25, 20, 15;
// output : 25

import java.util.ArrayList;
import java.util.List;

public class FindMaximum {

    // Time Complexity : O(n)
    public static int findMaximum(ArrayList<Integer> list) {
        if (list.size() == 0)
            return 0;
        int max = Integer.MIN_VALUE;
        int n = list.size();
        for (int i = 0; i < n; i++) {
            // if (max < list.get(i)) {
            //     max = list.get(i);
            // }
            // or
            max = Math.max(max, list.get(i)); // This is more efficient than the above line.
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(2, 5, 25, 20, 15));
        
        int max = findMaximum(list);
        System.out.println("Maximum found: " + max);
    }
}
