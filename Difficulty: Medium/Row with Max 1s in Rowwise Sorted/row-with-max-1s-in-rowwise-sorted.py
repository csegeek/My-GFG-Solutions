class Solution:
    def lower_bound(self, arr, x):
           low, high = 0, len(arr) - 1     
           ans = len(arr)                  

           while low <= high:
               mid = (low + high) // 2     
               if arr[mid] >= x:
                   ans = mid               
                   high = mid - 1          
               else:
                   low = mid + 1           
           return ans
           
    def rowWithMax1s(self, arr: list[list[int]]) -> int:
        # code here
        cnt_max=0
        cnt_ones=0
        index=-1;
        n=len(arr)
        m=len(arr[0])

        for i in range(len(arr)) :
            cnt_ones=m-self.lower_bound(arr[i],1)
            if(cnt_ones>cnt_max):
                cnt_max=cnt_ones
                index=i
        return index