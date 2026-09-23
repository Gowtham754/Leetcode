class Solution {
    public int minOperations(int[] nums, int x) {
        int tsum=0,n=nums.length;
        for(int num:nums){
            tsum+=num;
        }
        int tar=tsum-x;
        if(tar<0)return -1;
        if(tar==0)return n;
        int l=0;
        int sum=0;
        int maxlen=-1;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(sum>tar){
                sum-=nums[l];
                l++;
            }
            if(sum==tar){
                maxlen=Math.max(maxlen,r-l+1);
            }
        }
        if(maxlen==-1)return -1;
        else return n-maxlen;
    }
}