class Solution {
    public String toLowerCase(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            if (c >=65 && c <= 90 ) {
                sb.append((char) (c + 32));
            }
            else {
                sb.append((char) c);
            }
        }
        
        return sb.toString();
    }
}