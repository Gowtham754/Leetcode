class Solution {
    public static void f(int n,int open,int close,ArrayList<String>res,String s){
        if(s.length()==2*n) {
            res.add(s);
            return;
        }
        if(open<n){
        f(n,open+1,close,res,s+"(");
        }
        if(close<open){
          
            f(n,open,close+1,res,s+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String>res=new ArrayList<>();
        f(n,0,0,res,"");
        return res;
    }
}