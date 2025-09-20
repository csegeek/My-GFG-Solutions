class Solution {
    static int matrixMultiplication(int arr[]) {
        // code here
        // int [][] dp=new int[arr.length][arr.length];
        // for(int [] dpi:dp){
        //     Arrays.fill(dpi,-1);
        // }
        // return recursion(1,arr.length-1,arr,dp);
        
        return tabulation(arr);
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
    
    static int tabulation(int arr[]){
        int[][] dp=new int [arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            dp[i][i]=0;
        }
        for(int i=arr.length-1;i>0;i--){
            for(int j=i+1;j<arr.length;j++){
                int min=(int)1e9;
                for(int k=i;k<j;k++){
                    int steps=arr[i-1]*arr[k]*arr[j]+dp[i][k]+dp[k+1][j];
                    min=Math.min(min,steps);
                }
                dp[i][j]=min;
        }
        }
        return dp[1][arr.length-1];
    }
    
    
    
}