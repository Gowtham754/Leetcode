class Solution {
    public int[] twoSum(int[] nums, int target) {
       
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int j=target-nums[i];
        if(map.containsKey(j)){
            return new int[]{map.get(j)+1,i+1};
        }
        map.put(nums[i],i);
       }
       return new int[]{-1,-1};
    }
}