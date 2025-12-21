// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
         Map <Integer,Integer> psMap=new HashMap<>();
        int maxlength=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                int length=i+1;
                maxlength=Math.max(length,maxlength);  
            }
            if(psMap.containsKey(sum-k)){
                int length=i-psMap.get(sum-k);
                maxlength=Math.max(length,maxlength);
            }
            if(!psMap.containsKey(sum)){
                psMap.put(sum,i);
            }
        }
     return maxlength<0?0:maxlength;
    }
}
