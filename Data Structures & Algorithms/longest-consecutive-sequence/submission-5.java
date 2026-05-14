class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();

if(nums==null || nums.length==0) return 0;
        for(int x:nums){
            set.add(x);
        }


int max=1;
        for(int it:nums){
          
          if(!set.contains(it-1)){

            int count=1;
            int x=it;
            while(set.contains(x+1)){
                count++;
                x++;

            }

            max=Math.max(max,count);
          }

          
        }

        return max;
    }
}
