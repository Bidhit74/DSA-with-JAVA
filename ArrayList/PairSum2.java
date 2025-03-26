// Find if any pair in a sorted & rotated ArrayList has a target sum.

// list : = 11, 15, 6, 8, 9, 10
// target = 16

import java.util.ArrayList;
import java.util.List;

public class PairSum2 {

    // Two Pointer Approaches
    // Time Complexity : O(n)
    public static boolean isPairSum(ArrayList<Integer> list, int target) {
        int n = list.size();
        int pivot = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }
        int lp = pivot + 1, rp = pivot;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(11, 15, 6, 8, 9, 10));
        System.out.println(isPairSum(list, 22));
    }
}
