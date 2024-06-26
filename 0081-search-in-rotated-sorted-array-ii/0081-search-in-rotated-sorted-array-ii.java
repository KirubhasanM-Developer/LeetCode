class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) // If found at mid
                return true;
            
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) { // Handle duplicates
                left++;
                right--;
            } else if (nums[left] <= nums[mid]) { // Left half is sorted
                if (nums[left] <= target && target < nums[mid]) // Target is in the left half
                    right = mid - 1;
                else // Target is in the right half
                    left = mid + 1;
            } else { // Right half is sorted
                if (nums[mid] < target && target <= nums[right]) // Target is in the right half
                    left = mid + 1;
                else // Target is in the left half
                    right = mid - 1;
            }
        }
        
        return false; // If not found
    }
}
