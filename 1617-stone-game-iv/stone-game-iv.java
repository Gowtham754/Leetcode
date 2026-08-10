class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] win=new boolean[n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j*j<=i;j++){
            if(!win[i-j*j]){
              win[i]=true;
              break;
            }
        }
        }
        return win[n];
    }
}