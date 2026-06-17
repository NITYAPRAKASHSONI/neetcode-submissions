class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
list.add(new ArrayList<>());
        for(int num:nums){

int n=list.size();

for(int i=0;i<n;i++){
List<Integer> inner=new ArrayList<>(list.get(i));
inner.add(num);
list.add(inner);

}





        }

        return list;
    }
}
