public class Solution {
    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        // write your code here
        if (strs == null || strs.length < 1) {
            return "";
        }

        Arrays.sort(strs);
        char[] c1 = strs[0].toCharArray();
        char[] c2 = strs[strs.length - 1].toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < c1.length; i++) {
            if(c1[i] == c2[i]) {
                sb.append(c1[i]);
            }
            else{
                break;
            }
        }

        return sb.toString();
    }
}