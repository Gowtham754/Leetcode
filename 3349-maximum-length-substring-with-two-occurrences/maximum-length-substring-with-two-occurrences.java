class Solution {
    public int maximumLengthSubstring(String s) {
        int low=0;
        int cnt=0;
        int maxcnt=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
            char left=s.charAt(low);
            map.put(left,map.get(left)-1);
            low++;
           }
           cnt=i-low+1;
           maxcnt=Math.max(cnt,maxcnt);
        }
        return maxcnt;
    }
}