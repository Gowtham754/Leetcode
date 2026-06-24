class Solution {
    public int maximumUnits(int[][] arr, int truckSize) {
        Arrays.sort(arr,(a,b)->(b[1]-a[1]));
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            if(arr[i][0]<=truckSize){
                res+=(arr[i][0]*arr[i][1]);
                truckSize-=arr[i][0];
            }
            else{
                res+=arr[i][1]*truckSize;
                break;
            }
        }
        return res;
    }
}