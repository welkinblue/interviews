public class Solution {
    /**
     * @param source: 
     * @param target: 
     * @return: return the index
     */
    public int strStr(String source, String target) {
        // Write your code here
        if(source == null || target == null || source.length() < target.length()) {
            return -1;
        }
        
        if(source.length() == 0 && target.length() == 0 || source.equals(target)){
            return 0;
        }
        
        for(int i = 0; i <= source.length() - target.length(); i++) {
            String candidate = source.substring(i, i + target.length());
            if (match(candidate, target)) {
                return i;
            }
            continue;
        }
        
        return -1;
    }
    
    private boolean match(String candidate, String target) {
        for(int i = 0; i < candidate.length(); i++) {
            if(candidate.charAt(i) != target.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}