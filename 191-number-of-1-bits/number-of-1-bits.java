class Solution {
    public int hammingWeight(int n) {
        int cnt=0;
       String b=String.format("%32s",Integer.toBinaryString(n).replace(' ','0'));
       for(char ch:b.toCharArray()){
        if(ch=='1'){
            cnt++;
        }
       }

    return cnt;
    }
}