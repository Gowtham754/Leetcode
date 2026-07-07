class Solution {
    public int f(int i,int j,int m,int n,int dp[][],String txt1,String txt2){
        
           
            for( i=m-1;i>=0;i--){
                 char ch1=txt1.charAt(i);
                for( j=n-1;j>=0;j--){
                     char ch2=txt2.charAt(j);
                    if(ch1==ch2){
                        dp[i][j]=1+dp[i+1][j+1];
                    }
                    else{
                        dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
                    }
                }
            }
         return dp[0][0];  
    }
    
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[m+1][n+1];
        return f(0,0,m,n,dp,text1,text2);
    
    }
}