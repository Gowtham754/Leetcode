class Solution {
      public static void f(int nums[],int idx,List<List<Integer>>res,ArrayList<Integer>temp,boolean arr[]){
       if(temp.size()==nums.length){
        if(!res.contains(temp)){
           res.add(new ArrayList<>(temp));
        }
       }
       
       for(int i=0;i<nums.length;i++){
          if(arr[i]) continue;
            temp.add(nums[i]);
            arr[i]=true;
          
        f(nums,0,res,temp,arr);
          arr[i]=false;
          temp.remove(temp.size()-1);

       }
      }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();
        boolean arr[]=new boolean[nums.length];
        f(nums,0,res,new ArrayList<Integer>(),arr);
        return res;
         
    }
    
}