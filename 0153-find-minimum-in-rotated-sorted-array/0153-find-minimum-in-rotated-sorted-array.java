class Solution {
    public int findMin(int[] nums) {
        int n=nums.length, l=0, r=n-1;
        while(l<r){
            int mid=(l+r)/2;
            if(mid==l) break;
            if(nums[mid]<nums[l]){
                if(nums[mid-1]>nums[mid]) return nums[mid];
                r=mid-1;
            }
            else{
                if(nums[mid]<nums[r]) return nums[l];
                l=mid+1;
            }
        }
        return Math.min(nums[l], nums[r]);
    }
}