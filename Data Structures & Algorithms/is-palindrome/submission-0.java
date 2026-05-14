class Solution {
    public boolean isPalindrome(String s) {
        // Keep only alphanumeric characters and convert to lowercase
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Use two pointers to check for palindrome
        int start = 0;
        int end = cleaned.length() - 1;
        while (start < end) {
            if (cleaned.charAt(start) != cleaned.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
