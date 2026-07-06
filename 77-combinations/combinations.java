class Solution {
    public void f(int n,int k,ArrayList<List<Integer>>res,ArrayList<Integer>temp,int i){
        if(temp.size()==k){
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        if(i==n) return;
        if(i<=n){
            temp.add(i+1);
            f(n,k,res,temp,i+1);
        }
        temp.remove(temp.size()-1);
        f(n,k,res,temp,i+1);
    }
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>>res=new ArrayList<>();
        f(n,k,res,new ArrayList<Integer>(),0);
        return res;
    }
}