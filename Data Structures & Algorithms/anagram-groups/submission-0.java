class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map=new HashMap<>();
       List<List<String>> groupAnagram=new ArrayList<>();
       for(String s:strs){
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        String sorted=String.valueOf(ch);
        if(!map.containsKey(sorted)){
            map.put(sorted,new ArrayList<>());
        }
       map.get(sorted).add(s);
     
       }

       groupAnagram.addAll(map.values());
       return groupAnagram;
 
    }
}
