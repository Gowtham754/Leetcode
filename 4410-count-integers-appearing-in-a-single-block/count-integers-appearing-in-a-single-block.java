class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(i==0||nums[i]!=nums[i-1]){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            
        }
      for(int num:map.values()){
        if(num==1)cnt++;
      }
      return cnt;
    }
}