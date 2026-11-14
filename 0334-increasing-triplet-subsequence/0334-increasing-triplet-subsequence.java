class Solution {
    public boolean increasingTriplet(int[] nums) {
        // Start with the largest possible values
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= first) {
                first = num; // Found a new smallest value
            } else if (num <= second) {
                second = num; // Found a value greater than first but smaller than second
            } else {
                // If we find a number greater than both first and second, 
                // we have found our increasing triplet!
                return true;
            }
        }
        
        return false;
    }
}
