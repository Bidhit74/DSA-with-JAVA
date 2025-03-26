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

    
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(5);
        height.add(3);
        height.add(5);
        System.out.println("Maximum area: " + maxAreaBruteForce(height));
    }
}
