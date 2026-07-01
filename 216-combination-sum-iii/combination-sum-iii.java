class Solution {
    public static void f(int idx,int k,int n,List<Integer>temp,List<List<Integer>>ans){
        if(n==0&&temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(n<0&&temp.size()>k)return;
        for(int i=idx;i<=9;i++){
            temp.add(i);
            f(i+1,k,n-i,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        f(1,k,n,new ArrayList<>(),ans);
        return ans;
    }
}