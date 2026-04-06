class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int top=0;
        int bottom=mat.length-1;
        while(top<bottom){
            if(mat[top][bottom]==1){
                top++;
            }
            else if(mat[bottom][top]==1){
                bottom--;
            }
            else{
                top++;
                bottom--;
            }
        }
        if(top>bottom) return -1;
        for(int i=0;i<mat.length;i++){
            if(i!=top && mat[top][i]==1) return -1;
            if(i!=top && mat[i][top]==0) return -1;
        }
        return top;
    }
}