class Solution {
    public int[][] merge(int[][] arr) {
          Arrays.sort(arr,(a,b)->a[0]-b[0]);
        ArrayList<int[]>list=new ArrayList<>();
        int s=1;
        int el1=arr[0][0];
        int el2=arr[0][1];
        while(s<arr.length){
            if(arr[s][0]<=el2){
                 el2=Math.max(el2,arr[s][1]);
            }
            else{
               list.add(new int[]{el1,el2});
               el1=arr[s][0];
               el2=arr[s][1];
                
            }
            s++;
        }
        list.add(new int[]{el1,el2});
        return list.toArray(new int[list.size()][]);
    }
}