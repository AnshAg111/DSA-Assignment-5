class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length, i=0;
        int[] sq=new int[n];
        while(i<n && nums[i]<0) i++;
        int j=i-1, k=0;
        while(i<n && j>=0){
            if(nums[i]<Math.abs(nums[j])) {
                sq[k]=nums[i]*nums[i];
                i++;
            }
            else if(nums[i]>Math.abs(nums[j])){
                sq[k]=nums[j]*nums[j];
                j--;
            }
            else{
                sq[k]=nums[i]*nums[i];
                k++;
                sq[k]=nums[i]*nums[i];
                i++;
                j--;
            }
            k++;
        }
        while(i<n){
            sq[k]=nums[i]*nums[i];
            i++;
            k++;
        }
        while(j>=0){
            sq[k]=nums[j]*nums[j];
            j--;
            k++;
        }
        return sq;
    }
}