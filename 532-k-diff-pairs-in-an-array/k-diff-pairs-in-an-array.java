class Solution {
    public int findPairs(int[] arr, int k) {
         HashSet<String>list=new HashSet<>();
        int cnt=0;
        int temp=0;
       for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(Math.abs(arr[i]-arr[j])==k){
            int a=Math.max(arr[i],arr[j]);
            int b=Math.min(arr[i],arr[j]);
            list.add(a+"#"+b);
            }
       }
       }
        return list.size();
    }
}