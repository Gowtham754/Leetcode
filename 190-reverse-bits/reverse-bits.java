class Solution {
    public int reverseBits(int n) {
        String b=String.format("%32s",Integer.toBinaryString(n)).replace(' ','0');
        String a=new StringBuilder(b).reverse().toString();

      return (int) Long.parseLong(a,2);
    }
}