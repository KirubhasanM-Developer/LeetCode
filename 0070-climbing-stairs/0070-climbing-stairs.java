class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        // Initialize an array to hold the number of ways to reach each step
        int[] dp = new int[n + 1];
        dp[0] = 1; // There's 1 way to stay at the ground level (doing nothing)
        dp[1] = 1; // There's 1 way to reach the first step

        // Fill in the dp array using the recurrence relation
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // The number of ways to reach the nth step
        return dp[n];
    }
}
