public class TrapRainwater {
    // Q:- Traping Rainwater  -- Given 'n' non-negative integers representing an evevalution map where the 'width' of each bar is 1 , compute how much water it can trap after raining.
    // height = [4,2,0,6,3,2,5]
    
    //Using Auxiliary Arrays solves this problem  
    // Time Complexity: O(n)   Space Complexity: O(n)
    /* 
    public static int trapRainwater(int[] height) {
        int n = height.length;
        int totalTrapWater = 0;
        if (n <= 2) {
            return totalTrapWater;
        }
        // Check if the array is strictly ascending or descending
        boolean isAscending = true;
        boolean isDescending = true;
        for (int i = 1; i < n; i++) {
            if (height[i] < height[i - 1]) {
                isAscending = false;
            }
            if (height[i] > height[i - 1]) {
                isDescending = false;
            }
        }
        // If the array is either strictly ascending or descending, no water can be     trapped
        if (isAscending || isDescending) {
            return 0;
        }
        // Auxiliary Arrays
        int[] leftMaxBoundary = new int[n];
        int[] rightMaxBoundary = new int[n];
        // leftMaxBoundary Fill
        leftMaxBoundary[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMaxBoundary[i] = Math.max(leftMaxBoundary[i - 1], height[i]);
        }
        // rightMaxBoundary Fill
        rightMaxBoundary[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMaxBoundary[i] = Math.max(rightMaxBoundary[i + 1], height[i]);
        }
        for (int i = 0; i < n; i++) {
            int waterLabel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            // trapWater = (waterLabel - height[i])*width; // but this case height bar width is 1
            int trapWater = (waterLabel - height[i]);
            totalTrapWater += trapWater;
        }
        return totalTrapWater;
    }
     */

    // Same code with good comments 
    public static int trapRainwater(int[] height) {
        int n = height.length;
        // If the array has fewer than 3 bars, no water can be trapped
        if (n <= 2) {
            return 0;
        }
        // Check if the array is strictly ascending or strictly descending
        // If true, return 0 since no water can be trapped in a monotonic array
        boolean isAscending = true;
        boolean isDescending = true;
        for (int i = 1; i < n; i++) {
            if (height[i] < height[i - 1]) {
                isAscending = false; // Array is not strictly ascending
            }
            if (height[i] > height[i - 1]) {
                isDescending = false; // Array is not strictly descending
            }
        }
        if (isAscending || isDescending) {
            return 0;
        }
        int totalTrapWater = 0;
    
        // Arrays to store the maximum height to the left and right of each bar
        int[] leftMaxBoundary = new int[n];
        int[] rightMaxBoundary = new int[n];
    
        // Fill the leftMaxBoundary array
        leftMaxBoundary[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMaxBoundary[i] = Math.max(leftMaxBoundary[i - 1], height[i]);
        }
        // Fill the rightMaxBoundary array
        rightMaxBoundary[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMaxBoundary[i] = Math.max(rightMaxBoundary[i + 1], height[i]);
        }
        // Calculate the total trapped water by iterating through each bar
        for (int i = 0; i < n; i++) {
            // The water trapped above this bar is determined by the smaller of the two boundaries
            int trapWater = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]) - height[i];
            // Accumulate the trapped water
            totalTrapWater += trapWater;
        }
        return totalTrapWater;
    }
    
    public static void main(String[] args) {
        int[] height = {8,5,3,2};
        System.out.println("Total Trap Water = " + trapRainwater(height));
    }
}