class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int[] isFlipped = new int[n]; // To keep track of flips
        int flipCount = 0; // Current ongoing flips
        int result = 0; // Number of flips performed
        
        for (int i = 0; i < n; i++) {
            // Remove the effect of the flip that starts k positions back
            if (i >= k) {
                flipCount ^= isFlipped[i - k];
            }
            // Check if we need to flip at position i
            if (nums[i] == flipCount) { 
                if (i + k > n) return -1; // Not enough elements left to flip
                isFlipped[i] = 1; // Start a new flip
                flipCount ^= 1; // Update the ongoing flip count
                result++;
            }
        }
        
        return result;
    }
}
