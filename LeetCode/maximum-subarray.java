class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];

        for(int i = 1; i < dp.length; i++) {
            dp[i] = nums[i] + dp[i - 1] > 0 ? dp[i - 1] : 0;
            max = max(max, dp[i]);
        }
    
    private int max(int a, int b) {
        return a > b ? a : b;
    }

}