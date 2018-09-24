class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersection = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0,
            j = 0;
        while(i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            }
            else if (nums1[i] > nums2[j]) {
                j++;
            }
            else {
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[intersection.size()];
        i = 0;
        for(Integer num: intersection) {
            res[i++] = num;
        }
        return res;
    }
}