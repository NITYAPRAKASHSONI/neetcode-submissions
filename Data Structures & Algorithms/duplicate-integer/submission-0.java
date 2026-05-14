class Solution {
    public boolean hasDuplicate(int[] nums) {
          Set<Integer> set=new HashSet<>();
       for(int ch:nums){
           if(set.contains(ch)){
               return true;
           }else {
               set.add(ch);
           }
       }
       return false;
    }
}