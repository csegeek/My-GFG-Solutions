class Solution {
    
    class Pair {
        double sectionLength;
        int index;

        Pair(double sectionLength, int index) {
            this.sectionLength = sectionLength;
            this.index = index;
        }
    }
    
    public double minMaxDist(int[] stations, int k) {
        int n=stations.length;
         if(n==1) return 0;
        int [] howMany=new int[stations.length-1];
        
       PriorityQueue<Pair> pq = new PriorityQueue<>(
           (a, b) -> Double.compare(b.sectionLength, a.sectionLength)
       );
       
        
        for (int i = 0; i < n - 1; i++) {

            double diff = stations[i + 1] - stations[i];

            double sectionLength = diff / (howMany[i] + 1);

            pq.offer(new Pair(sectionLength, i));
        }

        
        for(int i=0;i<k;i++){
           Pair top=pq.poll();
           int index=top.index;
           howMany[index]++;
           double diff=stations[index+1]-stations[index];
           double newSection=diff/(howMany[index]+1);
           
           pq.offer(new Pair(newSection,index));
        }
        return pq.peek().sectionLength;
    }
    
}
