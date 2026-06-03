class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int l=0,r=0;
        int cnt=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(map.containsKey(ch)){
                l=Math.max(l,map.get(ch)+1);
            }
            map.put(ch,r);
                cnt=Math.max(cnt,r-l+1);
                r++;
           
        }
        
        return cnt;
    }
}