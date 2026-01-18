class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer> resp=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                resp.add(-1);
            }
            else{
                resp.add(st.peek());
            }
            st.push(arr[i]);
        }
        Collections.reverse(resp);
        return resp;
    }
}