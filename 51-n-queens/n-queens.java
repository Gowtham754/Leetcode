class Solution {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for (char[] row:board) {
            Arrays.fill(row, '.');
        }
        solve(0,board,ans,n);
        return ans;
    }
    private void solve(int col, char[][] board, List<List<String>> ans, int n) {
        if (col==n) {
             List<String> temp = new ArrayList<>();

    for (char[] row : board) {
        temp.add(new String(row));
    }

    ans.add(temp);
    return;
        }
        for (int row = 0; row < n; row++) {
            if (isSafe(row,col,board,n)) {
                board[row][col]='Q';
                solve(col+1,board,ans,n);
                board[row][col]='.';
            }
        }
    }
    private boolean isSafe(int row, int col, char[][] board, int n) {
        for (int j=col-1;j>=0;j--) {
            if(board[row][j]=='Q')
                return false;
        }
        for (int i=row-1,j=col-1;i>=0&&j>=0;i--,j--) {
            if(board[i][j]=='Q')
                return false;
        }

        for (int i=row+1,j=col-1;i<n&&j>=0;i++,j--) {
            if(board[i][j]=='Q')
                return false;
        }

        return true;
    }

   
}