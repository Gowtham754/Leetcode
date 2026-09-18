class Solution {
    public String truncateSentence(String s, int k) {
       int cnt=0, i=0, n=s.length();
       for(;i<n;i++){
        if(s.charAt(i)==' ')cnt++;
        if(cnt==k)break;
       }
       return s.substring(0,i);
    }
}