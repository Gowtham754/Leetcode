class Solution {
   
    public int uniquePaths(int m, int n) {
        int row1[]=new int[n];
        int row2[]=new int[n];
        for(int i=0;i<n;i++){
            row2[i]=1;
        }
        row1[n-1]=1;
        
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                row1[j]=row1[j+1]+row2[j];
                
            }
            int[] temp=row1;
                row1=row2;
                row2=temp;
        }
        return row2[0];
       
    }
}