class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return res;
        }
        
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] cs = str.toCharArray();
            Arrays.sort(cs);
            String s = new String(cs);
            
            if(!map.containsKey(s)) {
                map.put(s, new ArrayList<String>());
            }
            map.get(s).add(str);
        }
        
        for(String key: map.keySet()) {
            res.add(map.get(key));
        }
        
        return res;
    }
}