class Solution {
    public int findPairs(int[] arr, int k) {
         HashMap<Integer,Integer>map=new HashMap<>();
         int cnt=0;
         for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
         }
          if(k==0){
              for(int n:map.keySet()){
                if(map.get(n)>1){
                    cnt++;
                }
              }  
            }
            else{
                for(int n:map.keySet()) {
                if(map.containsKey(n+k)){
                     cnt++;
                 }
               }
            }
            return cnt;
    }
}