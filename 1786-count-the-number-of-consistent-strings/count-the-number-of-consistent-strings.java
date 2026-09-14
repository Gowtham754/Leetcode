class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt=0;
        boolean[] allowedChar=new boolean[26];

        for(char ch:allowed.toCharArray()){
            allowedChar[ch - 'a']=true;
        }
        
        for(String w:words){
            boolean b=true;
            for(char ch:w.toCharArray()){
                if(!allowedChar[ch - 'a']){
                    b=false;
                    break;
                }
            }
            if(b) cnt++;
        }
        return cnt;
    }
}