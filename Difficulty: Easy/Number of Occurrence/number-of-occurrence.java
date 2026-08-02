class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int first=lowerBound(arr,target);
        if(first == arr.length || arr[first] !=target){
            return 0;
        }
       int last=upperBound(arr,target)-1;
        return last-first+1;
    }
    
    
    public int upperBound(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;  // Default to length if not found

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                ans = mid;        // Store current index as potential answer
                high = mid - 1;   // Move left
            } else {
                low = mid + 1;    // Move right
            }
        }
        return ans;  // Return final answer
    }

    public int lowerBound(int[] arr, int x) {
        int low = 0;                  // Start index
        int high = arr.length - 1;    // End index
        int ans = arr.length;         // Default value if not found

        while (low <= high) {
            int mid = (low + high) / 2;  // Find mid index

            if (arr[mid] >= x) {
                ans = mid;            // Store possible answer
                high = mid - 1;       // Move left
            } else {
                low = mid + 1;        // Move right
            }
        }
        return ans;  // Return the lower bound index
  }
}
