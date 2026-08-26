class Solution {
public int aggressiveCows(int[] arr, int k) {
    Arrays.sort(arr);

    int high = arr[arr.length - 1]-arr[0];
    int low = 0;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(canWePlace(arr,k,mid)){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
      
    }
     return high; 
}   

    private boolean canWePlace(int[] arr,int k,int dist){
        int cntCows=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dist){
                cntCows++;
                 if(cntCows>=k)return true;
                last=arr[i];
            }
        }
        return false;
    }
    
   
}