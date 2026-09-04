class Solution {
    public double minMaxDist(int[] stations, int k) {
        // code here
        int n=stations.length;
        double low=0;
        double high=0;
        for(int i=1;i<n;i++){
            high=Math.max(high,stations[i]-stations[i-1]);
        }
        double gap=1e-6;
        while(high-low>gap){
            double mid=(low+high)/2.0;
            int cnt=noOfGasStationsRequired(stations,mid);
            if(cnt>k){
                low=mid;
            }
            else{
                high=mid;
            }
        }
        return high;
    }
    private int noOfGasStationsRequired(int[] stations,double dist){
        int cnt=0;
        
        for(int i=1;i<stations.length;i++){
            int numbersInBetween=(int)((stations[i]-stations[i-1])/dist);
            
            if((stations[i]-stations[i-1])/dist==numbersInBetween){
                numbersInBetween--;
            }
            cnt+=numbersInBetween;
        }
        return cnt;
    }
}
