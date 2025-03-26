// Container with Most Water 
// For given n lines on x-axis to form a container such that it holds maximum water.

// height = [1, 8, 6, 2, 5, 4, 8, 3, 7];
// output = 49

import java.util.ArrayList;

public class ContainerMostWater {

    // Brute force
    // Time complexity: O(n^2) 
    public static int maxAreaBruteForce(ArrayList<Integer> height) {
        int maxHeight = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int width = j - i;
                int area = Math.min(height.get(i), height.get(j)) * width;
                maxHeight = Math.max(maxHeight, area);
            }
        }
        return maxHeight;
    }

    // Optimised Solution
    // Time Complexity : O(n)
    // 2 Pointer Approach
    public static int storeWater(ArrayList<Integer> height) {
        int lp = 0, rp = height.size() - 1;
        int maxWater = 0;
        while (lp < rp) {
            int wi = rp - lp;
            int hi = Math.min(height.get(lp), height.get(rp));
            int currWater = hi * wi;
            maxWater = Math.max(maxWater, currWater);
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(3);
        height.add(5);
        height.add(4);
        System.out.println("Maximum area: " + maxAreaBruteForce(height));
        System.out.println("Maximum area: " + storeWater(height));
        
    }
}
