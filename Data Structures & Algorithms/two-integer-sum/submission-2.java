class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
int[] res=new int[2];

        for(int i=0;i<nums.length;i++){

            int diff=target-nums[i];
            if(map.containsKey(diff)){
res[0]=i;
res[1]=map.get(diff);

 Arrays.sort(res);

 return res;
            }

            map.put(nums[i],i);
        }

        return res;
    }
}
