class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int xr=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            xr=xr^arr[i];
            int x=xr^k;
            if(map.containsKey(x)){
              cnt+=map.get(x);
            }
            map.put(xr,map.getOrDefault(xr,0)+1);
        }
        return cnt;
    }
}