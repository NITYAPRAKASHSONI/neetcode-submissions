class Solution {
    public int singleNumber(int[] nums) {
        int unique=0;
        for(int x:nums){
            unique ^=x;
        }
        return unique;
    }
}
