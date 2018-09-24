public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target: An integer
     * @return: return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] nums, int target) {
        // write your code here
        int res = 0;
        if(nums == null || nums.length == 0) {
            return res;
        }

        res = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(sum - target) < Math.abs(res - target)){
                    res = sum;
                }
                if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
            
        }

        return res;
    }
}