class Solution {
    public int climbStairs(int n) {
        if(n < 0) {
            return 0;
        }
        
        if(n < 3) {
            return n;
        }
    
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[dp.length - 1];
        
    }
}