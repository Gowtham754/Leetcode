class Solution{
    public boolean sumGame(String num){
        int n=num.length();
        int half=n/2;
        int leftSum=0,rightSum=0;
        int leftQ=0,rightQ=0;

        for(int i=0;i<half;i++){
            if(num.charAt(i)=='?')
                leftQ++;
            else
                leftSum+=num.charAt(i)-'0';
        }

        for(int i=half;i<n;i++){
            if(num.charAt(i)=='?')
                rightQ++;
            else
                rightSum+=num.charAt(i)-'0';
        }

        if((leftQ+rightQ)%2==1)
            return true;

        int diff=leftQ-rightQ;

        if(diff==0)
            return leftSum!=rightSum;

        int sumDiff=leftSum-rightSum;

        return sumDiff!=-9*diff/2;
    }
}