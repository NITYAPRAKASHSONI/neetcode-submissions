class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();

        for(String word: strs){
            char[] sorted=word.toCharArray();

            Arrays.sort(sorted);

            String s=new String(sorted);

            map.putIfAbsent(s,new ArrayList<>());
            map.get(s).add(word);
        }
List<List<String>> result=new ArrayList<>();

   for(List<String> list:map.values()){
    result.add(list);
   }

return result;
        
    }
}
