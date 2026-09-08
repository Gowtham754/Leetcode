class Solution {
    public int len(int n){
        int cnt=0;
        while(n>0){
            cnt++;
            n/=10;
        }
        return cnt;
    }
    public int countCommas(int n) {
        int cnt=0;
        if(len(n)<4){
            return 0;
        }
        else{
         while(len(n)>=4){
            cnt++;
            n--;
         }
        }
        return cnt;
    }
}