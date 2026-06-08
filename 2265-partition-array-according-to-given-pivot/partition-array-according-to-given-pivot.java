class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        ArrayList<Integer>l3=new ArrayList<>();
        int []arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                l1.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                l2.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                l3.add(nums[i]);
            }
        }
        int i=0;
        for(i=0;i<l1.size();i++){
            arr[i]=l1.get(i);
        }
       for(int k=0;k<l3.size();k++){
        arr[i]=l3.get(k);
        i++;
       }
         for(int j=0;j<l2.size();j++){
            arr[i]=l2.get(j);
            i++;
         }
        return arr;
    }
}