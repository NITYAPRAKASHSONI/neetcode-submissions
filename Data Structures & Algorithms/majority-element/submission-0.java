class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
int max=0;
int res=0;
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);

            if(map.get(x)>max){
                res=x;
                max=map.get(x);
            }
        }

        return res;
    }
}