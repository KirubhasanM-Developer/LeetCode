class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        // Initialize dp table with -1
        int dp[][] = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        // Call solve function to get the result
        int ans = solve(s, dp, 0, n - 1);
        return ans;
    }

    public static int solve(String s, int[][] dp, int i, int e) {
        // Base cases
        if (i == e) {
            return 1; // A single character is a palindrome
        }
        if (i > e) {
            return 0; // No characters to form a palindrome
        }
        
        // Check if already computed
        if (dp[i][e] != -1) {
            return dp[i][e];
        }
        
        // If characters match, add 2 to the length and move inward
        if (s.charAt(i) == s.charAt(e)) {
            dp[i][e] = 2 + solve(s, dp, i + 1, e - 1);
            return dp[i][e];
        } 
           // Otherwise, take the maximum of either ignoring the left or right character
            int left = solve(s, dp, i + 1, e);
            int right = solve(s, dp, i, e - 1);
            dp[i][e] = Math.max(left, right);
           

        return dp[i][e];
    }
}
