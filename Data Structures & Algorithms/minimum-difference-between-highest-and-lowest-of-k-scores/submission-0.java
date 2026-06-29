class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <=nums.length - k; i++) {
            int lowest = nums[i];
            int highest = nums[i + k - 1];
            min = Math.min(min, highest - lowest);
        }

        return min;
    }
}