class Solution {
    public int reverseDegree(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            int num=('z'-s.charAt(i))+1;
            res+=num*(i+1);
        }
        return res;
    }
}