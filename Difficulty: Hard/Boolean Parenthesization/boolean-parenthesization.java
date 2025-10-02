class Solution {
    static int countWays(String s) {
        int[][][] dp=new int [s.length()][s.length()][2];
        for(int[][] dpi:dp){
            for(int[] dpj:dpi){
                Arrays.fill(dpj,-1);
            }
        }
        return recursion(0, s.length() - 1, 1, s,dp);
    }

    static int recursion(int i, int j, int isTrue, String s,int[][][]dp) {
        if (i > j) return 0;
        if (i == j) {
            if (isTrue == 1 && s.charAt(i) == 'T') return 1;
            if (isTrue == 0 && s.charAt(i) == 'F') return 1;
            return 0;
        }
        if(dp[i][j][isTrue]!=-1) return dp[i][j][isTrue];

        int ways = 0;
        for (int ind = i + 1; ind <= j - 1; ind += 2) {
            int LT = recursion(i, ind - 1, 1, s,dp);
            int LF = recursion(i, ind - 1, 0, s,dp);
            int RT = recursion(ind + 1, j, 1, s,dp);
            int RF = recursion(ind + 1, j, 0, s,dp);

            char op = s.charAt(ind);

            if (op == '&') {
                if (isTrue == 1) ways += LT * RT;
                else ways += LF * RF + LF * RT + LT * RF;
            }
            else if (op == '|') {
                if (isTrue == 1) ways += LT * RT + LF * RT + LT * RF;
                else ways += LF * RF;
            }
            else if (op == '^') {
                if (isTrue == 1) ways += LF * RT + LT * RF;
                else ways += LF * RF + LT * RT;
            }
        }
        return dp[i][j][isTrue]= ways;
    }
}
