class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
         int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        HashSet<Integer> set=new HashSet<>();
        for (int num:nums) {
            min=Math.min(min,num);
            max=Math.max(max,num);
            set.add(num);
        }
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=min+1;i<max;i++){
            if(!set.contains(min+1)){
                res.add(min+1);
            }
            min=min+1;
        }
        return res;
    }
}