class Solution {
    public int maxFreqSum(String s) {
      HashMap<Character,Integer>map1=new HashMap<>();
      HashMap<Character,Integer>map2=new HashMap<>();  
      for(char ch:s.toCharArray()){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }else{
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
      }
      int max1=0;
      int max2=0;
      for(int num:map1.values()){
        max1=Math.max(max1,num);
      }
       for(int num:map2.values()){
        max2=Math.max(max2,num);
      }
      return max1+max2;
    }
}