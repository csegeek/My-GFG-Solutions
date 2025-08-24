class Solution {
    public int cutRod(int[] price) {
        // code here
        int dp[][]=new int[price.length][price.length+1];
        for(int i=0;i<price.length;i++){
            Arrays.fill(dp[i],-1);
        }
     return recursion(price.length-1,price.length,price,dp);   
    }
    
    int recursion(int i,int l,int[] price,int[][]dp){
        if(l==0){
            return 0;
        }
        if(i==0){
            if(l>0){
              return l*price[0];
            }
            else return (int)-1e9;
        }
        if(dp[i][l]!=-1) return dp[i][l];
        int pick=(int)-1e9;
        if(l>i){
            pick=price[i]+recursion(i,l-(i+1),price,dp);
        }
        int notPick=recursion(i-1,l,price,dp);
        return dp[i][l]=Math.max(pick,notPick);
    }
}