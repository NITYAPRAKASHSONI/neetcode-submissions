class Solution {
    public int lengthOfLongestSubstring(String s) {
         int i = 0, max = 0;
        Set<Character> hs = new HashSet<>();

        for (int j = 0; j < s.length(); j++) {
            char currentChar = s.charAt(j);
            while (hs.contains(currentChar)) {
                hs.remove(s.charAt(i));
                i++;
            }
            hs.add(currentChar);
            max = Math.max(max, j - i + 1);
        }

        return max;
    }
}
