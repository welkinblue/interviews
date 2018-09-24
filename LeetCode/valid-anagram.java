class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] map = new int[128];
        
        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i),
                 c2 = t.charAt(i);
            map[c1 - 'a']++;
            map[c2 - 'a']--;
        }
        
        for(int i = 0; i < map.length; i++){
            if(map[i] != 0){
                return false;
            }
        }
        return true;
    }
}