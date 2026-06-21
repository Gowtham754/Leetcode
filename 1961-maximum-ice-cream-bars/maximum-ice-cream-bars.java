class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cnt=0;
        if(coins==0){
            return 0;
        }
        for(int i=0;i<costs.length;i++){
            if(coins>0&&coins>=costs[i]){
                cnt++;
                coins-=costs[i];
            }
        }
        return cnt;
    }
}