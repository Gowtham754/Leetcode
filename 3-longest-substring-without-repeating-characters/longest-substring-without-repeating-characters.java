class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int i=0,j=0;
        int cnt=0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                cnt=Math.max(cnt,j-i+1);
                j++;
            }
            else{
              
                set.remove(s.charAt(i++));
            }
        }
        
        return cnt;
    }
}