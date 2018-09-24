class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) {
            return null;
        }
        Set<Integer> set = new HashSet<>(),
                     intersection = new HashSet<>();
        for(int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) {
                intersection.add(nums2[i]);
            }
        }

        int[] res = new int[intersection.size()];
        int i = 0;

        for(Integer num: intersection) {
            res[i++] = num;
        }

        return res;
    } 
}