public class Solution {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int lo = 0;
        int hi = nums.length - 1;
        
        if(nums[lo] < nums[hi]) {
            return nums[lo];
        }
        
        while(lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            if(nums[lo] > nums[mid]) {
                hi = mid;
            }
            else if(nums[hi] < nums[mid]) {
                lo = mid;
            }
        }
        if(nums[lo] < nums[hi]) {
            return nums[lo];
        }
        return nums[hi];
    }
}