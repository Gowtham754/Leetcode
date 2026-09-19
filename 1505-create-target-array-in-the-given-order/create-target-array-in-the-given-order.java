class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer>list=new ArrayList<>();
      for(int i=0;i<nums.length;i++){
        list.add(index[i],nums[i]);
      }
       
        int res[]=new int[list.size()];
        for(int k=0;k<list.size();k++){
            res[k]=list.get(k);
        }
        return res;
    }
}