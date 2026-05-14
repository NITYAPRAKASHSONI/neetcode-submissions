class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) return result; // Handle edge case: array too small
        
        Arrays.sort(nums); // Sort the array to use two-pointer technique and handle duplicates
        int n = nums.length;
        
        for (int i = 0; i < n - 2; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int j = i + 1; // Left pointer
            int k = n - 1; // Right pointer
            
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                if (sum < 0) {
                    j++; // Sum too small, increment left pointer
                } else if (sum > 0) {
                    k--; // Sum too large, decrement right pointer
                } else {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    
                    // Skip duplicates for the second and third elements
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    
                    j++;
                    k--;
                }
            }
        }
        
        return result;
    }
}