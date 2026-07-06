class Solution {
    public boolean f(char[][] b,String w,int i,int j,int k,boolean[][] visit,int m,int n){
       if(k==w.length()) return true;
       visit[i][j]=true;
       if(i+1<n&&b[i+1][j]==w.charAt(k)&&visit[i+1][j]!=true){
        if(f(b,w,i+1,j,k+1,visit,m,n))
        return true;
       }
       if(j+1<m&&b[i][j+1]==w.charAt(k)&&visit[i][j+1]!=true){
        if(f(b,w,i,j+1,k+1,visit,m,n))
        return true;
       }
       if(i-1>=0&&b[i-1][j]==w.charAt(k)&&visit[i-1][j]!=true){
        if(f(b,w,i-1,j,k+1,visit,m,n))
        return true;
       }
        if(j-1>=0&&b[i][j-1]==w.charAt(k)&&visit[i][j-1]!=true){
        if(f(b,w,i,j-1,k+1,visit,m,n))
        return true;
       }
       visit[i][j]=false;
       return false;
    }
    public boolean exist(char[][] board, String word) {
       int n=board.length;
       int m=board[0].length;
       boolean visit[][]=new boolean[n][m];
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
           if(board[i][j]==word.charAt(0)){
            if(f(board,word,i,j,1,visit,m,n))
              return true;
           }
       }
       }
       return false;
    }
}