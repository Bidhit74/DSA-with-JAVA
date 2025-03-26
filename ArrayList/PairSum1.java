// Pair Sum - 1
// Find if any pair in a sorted ArrayList has a target sum.

// list = [1, 2, 3, 4, 5]
// target = 5

import java.util.ArrayList;
import java.util.List;

public class PairSum1 {

    // Brute force approach
    // Time complexity: O(n^2)
    static ArrayList<Integer> pairSum = new ArrayList<>();
    public static boolean findPairBruteForce(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    pairSum.add(list.get(i));
                    pairSum.add(list.get(j));
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        int target = 5;
        System.out.println(findPairBruteForce(list, target));
        System.out.println("Pair Sum = " + pairSum);
    }
}
