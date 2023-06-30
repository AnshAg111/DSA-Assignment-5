class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int, int>m1, m2;
        int n1=nums1.size(), n2=nums2.size();
        vector<int>u, v;
        for(int i=0; i<n1; i++) m1[nums1[i]]++;
        for(int i=0; i<n2; i++) m2[nums2[i]]++;
        for(int i=0; i<n1; i++){
            if(m2[nums1[i]]==0 and m1[nums1[i]]==1) v.push_back(nums1[i]);
            m1[nums1[i]]--; 
        }
        for(int i=0; i<n1; i++) m1[nums1[i]]++;
        for(int i=0; i<n2; i++){
            if(m1[nums2[i]]==0 and m2[nums2[i]]==1) u.push_back(nums2[i]);
            m2[nums2[i]]--; 
        }
        vector<vector<int>>ans;
        ans.push_back(v);
        ans.push_back(u);
        return ans;
    }
};