class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        for(int i=1;;i++){
            if(!list.contains(k*i)){
                return k*i;
            }
        }
       
    }
}