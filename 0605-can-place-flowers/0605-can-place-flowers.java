class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        
        for (int i = 0; i < length; i++) {
            // Check if we have already planted all required flowers
            if (n <= 0) {
                return true;
            }
            
            // Check if the current plot is empty
            if (flowerbed[i] == 0) {
                // Check if the left plot is empty (or if it's the first plot)
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                
                // Check if the right plot is empty (or if it's the last plot)
                boolean rightEmpty = (i == length - 1) || (flowerbed[i + 1] == 0);
                
                // If both sides are clear, plant a flower here
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1; // Mark as planted
                    n--;              // Reduce the count of flowers left to plant
                    i++;              // Optimization: Skip the next plot since we just planted a flower
                }
            }
        }
        
        return n <= 0;
    }
}
