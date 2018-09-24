class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length < 1) {
            return 0;
        }

        int[] dp = new int[nums.length];
        for(int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }

        int maxLen = 1;
        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[i] > nums[j]) {
                    dp[i] = max(dp[i], dp[j] + 1);
                }
                maxLen = max(maxLen, dp[i]);
            }
        }
        return maxLen;
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }
}