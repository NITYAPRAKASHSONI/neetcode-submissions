class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1; // search right side
            } else if (nums[mid] > target) {
                end = mid - 1;   // search left side
            } else {
                return mid;      // target found
            }
        }

        return -1; // target not found
    }
}