class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
      ArrayList<List<Integer>>li=new ArrayList<>();
      int sum=Integer.MIN_VALUE;
      for(int i=0;i<nums.length-2;i++){
        if(i>0&&nums[i]==nums[i-1]) continue;
        int j=i+1;
        int k=nums.length-1;
        while(j<k){
            sum=nums[i]+nums[j]+nums[k];
            if(sum==0){
                ArrayList<Integer>l1=new ArrayList<>();
                l1.add(nums[i]);
                l1.add(nums[j]);
                l1.add(nums[k]);
                li.add(l1);
                j++;
                k--;
            while(j<k&&nums[j]==nums[j-1]) j++;
            while(j<k&&nums[k]==nums[k+1])k--;
            }
            else if(sum<0){
                j++;
            }
            else{
                k--;
            }
            
        }
      }
      return li;  
    }
}