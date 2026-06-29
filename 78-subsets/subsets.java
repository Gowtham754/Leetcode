class Solution {
    void f(int idx,int []nums,ArrayList<Integer>temp,ArrayList<List<Integer>>res){
        int n=nums.length;
        if(idx>=n){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        f(idx+1,nums,temp,res);
        temp.remove(temp.size()-1);
        f(idx+1,nums,temp,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        
       ArrayList<List<Integer>>res=new ArrayList<>();
       f(0,nums,new ArrayList<Integer>(),res);
       return res;
    }
}