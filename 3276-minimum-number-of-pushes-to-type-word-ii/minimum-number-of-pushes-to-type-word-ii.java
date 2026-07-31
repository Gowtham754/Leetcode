class Solution {
    public int minimumPushes(String word) {
        TreeMap<Character,Integer>map=new TreeMap<>();
        for(char ch:word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<Integer>list=new ArrayList<>(map.values());
        Collections.sort(list,Collections.reverseOrder());
        int cnt=0;
        int res=0;
        for(int n:list){
          res+=n*((cnt/8)+1);
          cnt++;
        }
        return res;
    }
}