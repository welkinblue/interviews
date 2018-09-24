class Solution {
    public int minSwap(int[] A, int[] B) {
        int[] dp = new int[A.length];
        dp[0] = 0;

        for(int i = 1; i < dp.length; i++) {
            if(A[i] > A[i - 1] && B[i] > B[i - 1]) {
                dp[i] = dp[i - 1];
            }
            else{
                dp[i] = dp[i - 1] + 1;
            }
        }

    }
}