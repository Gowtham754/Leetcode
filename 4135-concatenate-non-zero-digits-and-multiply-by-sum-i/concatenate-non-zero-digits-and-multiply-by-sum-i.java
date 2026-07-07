class Solution {
    public long sumAndMultiply(int n) {
       long x=0;
      while(n>0){
        if(n%10!=0){
        x=x*10+n%10;
        }
        n/=10;
       }
       long sum2=0;
       long res=0;
       long temp=x;
       while(temp>0){
        res=res*10+temp%10;
        temp/=10;
       }
       while(x>0){
         sum2+=x%10;
          x/=10;
       } 
      return res*sum2;
    }
}