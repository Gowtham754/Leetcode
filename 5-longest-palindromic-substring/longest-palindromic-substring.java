class Solution {
    public boolean palindrome(String s,int low,int high){
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
               if(palindrome(s,i,j)){
                if(j-i+1>res.length()){
                    res=s.substring(i,j+1);
                }
               }
            }
        }
        return res;
    }
}