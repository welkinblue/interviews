public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @return: Find all unique triplets in the array which gives the sum of zero.
     */
    public List<List<Integer>> threeSum(int[] nums) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            return res;
        }

        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int sum = - nums[i];
                int left = i + 1;
                int right = nums.length - 1;
                while(left < right) {
                    if(nums[left] + nums[right] == sum) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while(left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while(left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if(nums[left] + nums[right] < sum) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
        }

        return res;
    }
}