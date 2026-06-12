class Solution {
    public int compress(char[] chars) {
       int i=0;
       int j=0;
       while(i<chars.length){
        char curr=chars[i];
           int cnt=0;
           while(i<chars.length&&curr==chars[i]){
            cnt++;
            i++;
           }
           chars[j++]=curr;
           if(cnt>1){
            String count=String.valueOf(cnt);
            for(char c:count.toCharArray()){
                chars[j++]=c;
            }
           }
       }
       return j;
    }
}