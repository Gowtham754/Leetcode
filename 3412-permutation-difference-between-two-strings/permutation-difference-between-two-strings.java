class Solution {
    public int findPermutationDifference(String s, String t) {
        int res=0;
        for(char ch:s.toCharArray()){
            int idx1=s.indexOf(ch);
            int idx2=t.indexOf(ch);
            res+=Math.abs(idx1-idx2);
        }
        return res;
    }
}