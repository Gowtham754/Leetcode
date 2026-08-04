class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[n-1];
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(nums[i]);
        }
        for(int i=min+1;i<max;i++){
            if(!list.contains(min+1)){
                res.add(min+1);
            }
            min=min+1;
        }
        return res;
    }
}