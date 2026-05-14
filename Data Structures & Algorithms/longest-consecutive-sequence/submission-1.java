class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> hs=new HashSet<>();

       for(int num:nums){
        hs.add(num);
       } 

       int max=0;
       for(int num:hs){
        if(!hs.contains(num-1)){
            int curr=1;
            while(hs.contains(num+curr)){
                curr++;
            }

            max=Math.max(curr,max);
        }
       }

       return max;
    }
}
