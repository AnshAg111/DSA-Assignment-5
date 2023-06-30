class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n=arr1.length, m=arr2.length, ans=0;
        for(int i=0; i<n; i++){
            int flag=1;
            for(int j=0; j<m; j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    flag=0;
                    break;
                }
            }
            if(flag==1) ans++;
        }
        return ans;
    }
}