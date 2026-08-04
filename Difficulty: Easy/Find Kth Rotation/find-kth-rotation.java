class Solution {
    public int findKRotation(int nums[]) {
        // Code here
        int min=Integer.MAX_VALUE;
        int minIndex=0;
        int low =0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[low]<=nums[mid]){
                if(nums[low]<min){
                    min=nums[low];
                    minIndex=low;
                }
                low=mid+1;
            }
            else{
                if(nums[mid]<min){
                    min=nums[mid];
                    minIndex=mid;
                }
                    high=mid-1;
            }
        }
        return minIndex;
    }
}