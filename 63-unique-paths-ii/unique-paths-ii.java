class Solution {
    public int uniquePathsWithObstacles(int[][] dp1) {
       int n=dp1[0].length;
       int m=dp1.length;
    int dp[][]=new int[m][n];

    if(dp1[0][0]==1||dp1[m-1][n-1]==1) return 0;

        for(int i=n-1;i>=0;i--){
            if(dp1[m-1][i]==1){
                break;
            }
            else{
            dp[m-1][i]=1;
            }
        }

         for(int i=m-1;i>=0;i--){
            if(dp1[i][n-1]==1) break;
           else dp[i][n-1]=1;
        }

        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                if(dp1[i][j]!=1){
                int right=dp[i][j+1];
                int down=dp[i+1][j];
                dp[i][j]=right+down;
                }
                
            }
        }
        return dp[0][0];
       
    }
}
    
