// Lonely Numbers in ArrayList(MEDIUM)
// Youaregivenanintegerarraylistnums.Anumberxislonelywhenitappearsonlyonce,and
// no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
// Return all lonely numbers in nums. You may return the answer in any order.

// Sample Input 1: nums = [10,6,5,8]
// Sample Output 1: [10,8]
// Explanation :- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.- 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums. 5 is not a lonely number since 6 appears in nums and vice versa.
// Hence, the lonely numbers in nums are [10, 8].
// Note that [8, 10] may also be returned.

// Sample Input 2 : nums = [1,3,5,3]
// Sample Output 2 : [1,5]
// Explanation :- 1 is a lonely number since it appears exactly once and 0 and 2 does not appear in nums. 5 is a lonely number since it appears exactly once and 4 and 6 does not appear in nums. 3 is not a lonely number since it appears twice.
// Hence, the lonely numbers in nums are [1, 5].
// Note that [5, 1] may also be returned.

// Constraints :
// ● 1 <= nums.size() <= 105
// ● 0 <= nums.get(i) <= 106

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LonelyNumbersArrayList {

    // Time Complexity : O(n log n)
    public static ArrayList<Integer> findLonelyNumbers(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> lonelyNumbers = new ArrayList<>();
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            boolean isLonely = true;
            if (i > 0 && nums.get(i) == nums.get(i - 1)) {
                // No Unique number 
                isLonely = false;
            }
            else if (i < n - 1 && nums.get(i) == nums.get(i + 1)) {
                isLonely = false; // Appears more than once
            }
            else if (i < n - 1 && nums.get(i) == nums.get(i + 1) - 1 ) {
                isLonely = false; // Has a right neighbor
            }
            else if (i > 0 && nums.get(i) == nums.get(i - 1) + 1) {
                isLonely = false; // Has a left neighbor
            }
            
            if (isLonely) {
                lonelyNumbers.add(nums.get(i));
            }
        }
        return lonelyNumbers;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 6, 5, 8));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1,3,5,3));
        System.out.println(findLonelyNumbers(list));
        System.out.println(findLonelyNumbers(list2));
    }
}
