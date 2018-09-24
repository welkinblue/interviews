class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int start = 0,
            end = 0,
            length = 0,
            maxLength = 0;
        
        while (end < s.length()) {
            if (map.containsKey(s.charAt(end))) {
                start = map.get(s.charAt(end)) + 1;
            }
            map.put(s.charAt(end), end);
            length = end - start + 1;
            maxLength = Math.max(length, maxLength);
            end++;
        }

        return maxLength;
    }
}