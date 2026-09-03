class Solution {
    public boolean uniformArray(int[] nums1) {
     int min=Integer.MAX_VALUE;
      for(int i=0;i<nums1.length;i++){
       if(nums1[i]%2!=0){
        min=Math.min(min,nums1[i]);
       }
      }
      for(int i=0;i<nums1.length;i++){
        if(nums1[i]%2==0&&min!=Integer.MAX_VALUE&&nums1[i]<min){
            return false;
        }
      }
            return true;
    }
}