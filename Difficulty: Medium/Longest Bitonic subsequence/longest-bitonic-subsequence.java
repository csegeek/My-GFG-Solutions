
class Solution {
    public static int LongestBitonicSequence(int n, int[] nums) {
        // code here
     return tabulation(nums);
        
    }

    static int tabulation(int [] nums){
        int[] dp1=new int[nums.length+1];
        Arrays.fill(dp1,1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=i-1;j++){
                if(nums[i]>nums[j] && 1+dp1[j]>dp1[i]){
                dp1[i]=1+dp1[j];
                } 
            }
        }
        int[] dp2=new int[nums.length+1];
        Arrays.fill(dp2,1);
        for(int i=nums.length-1;i>=0;i--){
            for(int j=nums.length-1;j>=i+1;j--){
                if(nums[i]>nums[j] && 1+dp2[j]>dp2[i]){
                dp2[i]=1+dp2[j];
                } 
            }
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(dp1[i] > 1 && dp2[i] > 1)
            max=Math.max(max,dp1[i]+dp2[i]-1);
        }
        return max;
        
     }
}
