class Solution {
    public int smallestIndex(int[] nums) {
        int res=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int dig=nums[i];
            int sum=0;
            while(dig!=0){
                sum+=dig%10;
                dig/=10;
            }
            if(sum==i){
                res=Math.min(i,res);
            }
        }
        if(res==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return res;
        }
    }
}