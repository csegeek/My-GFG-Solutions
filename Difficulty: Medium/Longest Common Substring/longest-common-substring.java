// User function Template for Java

class Solution {
    public int longestCommonSubstr(String s1, String s2) {
        // code here
        return tabulation(s1,s2);
    }
    
     int tabulation(String text1,String text2){
       int dp[][]=new int [text1.length()+1][text2.length()+1];
       int max=0;
       for(int i1=1;i1<=text1.length();i1++){
        for(int i2=1;i2<=text2.length();i2++){
           if(text1.charAt(i1-1)==text2.charAt(i2-1)){
             dp[i1][i2]= 1+dp[i1-1][i2-1];
             max=Math.max(max,dp[i1][i2]);
            } 
            else{
                dp[i1][i2]=0;
            }
        }
       }
    
    // int n=text1.length();
    // int m=text2.length();
    // int len=dp[n][m];
    // int i=n;
    // int j=m;
    // int index = len-1;
    // String str="";

    // for(int k=1; k<=len;k++){
    //     str +="$"; // dummy string
    // }

    // StringBuilder str2=new StringBuilder(str);

    // while(i>0 && j>0){
    //     if(text1.charAt(i-1) == text2.charAt(j-1)){
    //         str2.setCharAt(index,text1.charAt(i-1) ); 
    //         index--;
    //         i--;
    //         j--;
    //     }
    //     else if( dp[i-1][j] > dp[i][j-1]){
    //         i--;
    //     }
    //     else j--;
    // }

    // System.out.println(str2);

    return max;
    }
  
}