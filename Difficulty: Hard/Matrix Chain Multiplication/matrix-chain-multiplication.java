class Solution {
    static int matrixMultiplication(int arr[]) {
        // code here
        int [][] dp=new int[arr.length][arr.length];
        for(int [] dpi:dp){
            Arrays.fill(dpi,-1);
        }
        return recursion(1,arr.length-1,arr,dp);
    }
    
   static int recursion(int i,int j,int arr[],int [][] dp){
        if(i==j) return 0;
        if(dp[i][j] !=-1) return dp[i][j];
        int min=(int)1e9;
        for(int k=i;k<j;k++){
            int steps=arr[i-1]*arr[k]*arr[j]+recursion(i,k,arr,dp)+recursion(k+1,j,arr,dp);
            min=Math.min(min,steps);
        }
        return dp[i][j]=min;
    }
}