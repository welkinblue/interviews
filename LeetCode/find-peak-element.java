class Solution {
    public int findPeakElement(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int lo = 0;
        int hi = nums.length - 1;
        while(lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            if(nums[mid] < nums[mid - 1]) {
                hi = mid;
            }
            else if(nums[mid] < nums[mid + 1]){
                lo = mid;
            }
            else {
                return mid;
            }
        }
        if(nums[lo] < nums[hi]) {
            return hi;
        }
        return lo;
    }
}