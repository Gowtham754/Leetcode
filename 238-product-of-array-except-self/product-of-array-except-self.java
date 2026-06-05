class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        int prefix=1;
        arr[arr.length-1]=1;
        for(int i=arr.length-2;i>=0;i--){
            arr[i]=nums[i+1]*arr[i+1];
        }
        for(int i=0;i<nums.length;i++){
            arr[i]=prefix*arr[i];
            prefix*=nums[i];
        }
        return arr;
    }
}