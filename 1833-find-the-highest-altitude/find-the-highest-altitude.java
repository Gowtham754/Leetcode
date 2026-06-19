class Solution {
    public int largestAltitude(int[] gain) {
        int high=0;
        int pre=0;
        for(int i=0;i<gain.length;i++){
            pre+=gain[i];
            high=Math.max(pre,high);
        }
        return  high;
    }
}