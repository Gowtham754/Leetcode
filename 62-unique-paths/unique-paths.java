class Solution {
    public int f(int m,int n,int i,int j,int dp[][]){
        
        if(i==m-1||j==n-1){
            return 1;
        }
        if(dp[i][j]!=0)return dp[i][j];
        int c=0;
        if(j+1<n){
            c+=f(m,n,i,j+1,dp);
        }
        if(i+1<m){
            c+=f(m,n,i+1,j,dp);
        }
        dp[i][j]=c;
        return c;
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        int c=f(m,n,0,0,dp);
        return c;
       
    }
}