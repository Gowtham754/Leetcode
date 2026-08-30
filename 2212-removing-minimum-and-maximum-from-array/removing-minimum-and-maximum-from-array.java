class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int mincnt=-1;
        int maxcnt=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                 mincnt=i;
            }
             if(nums[i]>max){
                max=nums[i];
                maxcnt=i;
            }
        }
         int n=nums.length;

        int removeLeft=Math.max(mincnt,maxcnt)+1;

        int removeRight=n-Math.min(mincnt,maxcnt);

        int removeBoth=
            Math.min(mincnt,maxcnt)+1
            + n-Math.max(mincnt,maxcnt);

        return Math.min(removeLeft,
               Math.min(removeRight,removeBoth));
    }
}