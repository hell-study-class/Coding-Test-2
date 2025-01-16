class Solution {
    
    private int[] dp;
    
    private int sol(int n) {
        dp = new int[n+1];
        if (n <= 2) {
            return 1;
        }
        
        dp[1] = 1;
        dp[2] = 1;
        for (int i=3;i<n+1;i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }
        
        return dp[n];
    }
    
    public int solution(int n) {
        return new Solution().sol(n);
    }
}
