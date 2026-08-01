class Solution {
    public int f(int[] arr,int l,int r){
        if(l==r)return arr[l];
       int left=arr[l]-f(arr,l+1,r);
       int right=arr[r]-f(arr,l,r-1);
        return Math.max(left,right);
    }
    public boolean predictTheWinner(int[] nums) {
        return f(nums,0,nums.length-1)>=0;
    }
}