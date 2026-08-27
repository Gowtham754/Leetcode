class Solution {
    public int scoreOfString(String s) {
        int res=0;
        ArrayList<Integer>list=new ArrayList<>();
        for(char ch:s.toCharArray()){
            list.add((int)(ch));
        }
        for(int i=1;i<list.size();i++){
            res+=Math.abs(list.get(i-1)-list.get(i));
        }
        return res;
    }
}