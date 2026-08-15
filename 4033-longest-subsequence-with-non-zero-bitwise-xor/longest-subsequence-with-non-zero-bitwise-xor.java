class Solution {
    public int longestSubsequence(int[] nums) {
        int res=0;
        int l=0;
        int temp=0;
        while(l<nums.length){
            temp=temp^nums[l];
            l++;
        }
        if(temp!=0){
            res=nums.length;
        }
        else{
            l=0;
            while(l<nums.length){
                if(nums[l]!=0){
                    res=nums.length-1;
                    break;
                }
                l++;
            }
        }
        return res;
    }
}