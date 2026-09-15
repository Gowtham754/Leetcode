class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(nums[i]);
        }
        for(int i=n;i<nums.length;i++){
            l2.add(nums[i]);
        }
        int arr[]=new int[nums.length];
        int j=0;
        for(int i=0;i<n;i++){
          arr[j++]=l1.get(i);
          arr[j++]=l2.get(i);
        }
        return arr;
    }
}