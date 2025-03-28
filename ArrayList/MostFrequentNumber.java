// Most Frequent Number following Key (EASY) - leetcode 2190
// You are given an integer Arraylist nums. You are also given an integer key, which is present in nums.
// For every unique integer target in nums, count the number of times target immediately follows an occurrence of key in nums. In other words, count the number of indices i such that:
// 0 <= i <= nums.size() - 2,
// nums.get(i) == key and,
// nums.get(i+1) == target.
// Return the target with the maximum count.
// (Assumption- that the target with maximum count is unique.)

// Sample Input 1 :nums = [1,100,200,1,100], key = 1
// Sample Output 1 :  100
// Explanation :
// For target = 100, there are 2 occurrences at indices 1 and 4 which follow an occurrence of key.
// No other integers follow an occurrence of key, so we return 100.

// Constraints :
// ● 2 <= nums.size() <= 1000
// ● 1 <= nums.get(i) <= 1000
// ● Assume that the answer is unique

import java.util.ArrayList;
import java.util.List;

public class MostFrequentNumber {

    public static int mostFrequent(ArrayList<Integer> nums, int key) {
        int[]result = new int[1000];
        for(int i=0; i<nums.size()-1; i++){
            if(nums.get(i) == key){
            result[nums.get(i+1)-1]++;
        }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < 1000; i++) {
            if (result[i] > max) {
            max = result[i];
            ans = i+1;
        }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>(List.of(1, 300, 200, 1, 200));
        int key = 1;
        System.out.println(mostFrequent(ans, key));
    }
}
