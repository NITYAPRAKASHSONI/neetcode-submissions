class Solution {
    public boolean canJump(int[] nums) {
        int max=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(i+nums[i]>=max){
                max=i;
            }
        }

        return max==0;
    }
}
