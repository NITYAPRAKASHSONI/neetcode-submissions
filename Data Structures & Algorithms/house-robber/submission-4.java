class Solution {
    public int rob(int[] nums) {
        
        //return solve(nums,0);

        int prev1=0;
        int prev2=0;
        for(int i:nums){
            int take= i+prev2;
            int skip =prev1;
            int curr=Math.max(take,skip);
            prev2=prev1;
            prev1=curr;

        }

return prev1;
    }

    // private int solve(int[] nums,int i){

    //     if(i>=nums.length){
    //         return 0;

    //     }

    //     int take=solve(nums,i+1);
    //     int pick=nums[i] +solve(nums,i+2);

    //     return Math.max(take,pick);
    // }
}
