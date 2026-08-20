class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        int j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(i==0) l1.add(nums[i]);
            else if(i==1) l2.add(nums[i]);
           else{
            int e1=l1.get(l1.size()-1);
            int el2=l2.get(l2.size()-1);
            if(e1>el2) l1.add(nums[i]);
            else l2.add(nums[i]);
           }
           
        }
        ArrayList<Integer>res=new ArrayList<>();
        for(int num:l1){
            res.add(num);
        }
        for(int num:l2){
            res.add(num);
        }
      int ans[]=new int[res.size()];
      for(int i=0;i<ans.length;i++){
        ans[i]=res.get(i);
      }
      return ans;
    }
}