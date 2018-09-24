class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        int[] dp = new int[prices.length + 1];
        dp[0] = 0;

        for(int i = 1; i < dp.length; i++) {
            min = prices[i - 1] < min ? prices[i - 1] : min;
            dp[i] = Math.max(dp[i - 1], prices[i - 1] - min);
        }

        return dp[dp.length - 1];
    }
}