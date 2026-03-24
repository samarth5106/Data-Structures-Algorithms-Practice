class Solution {
public:
    void merge(vector<int>& nums1,int m,vector<int>& nums2,int n) {
        int i=0;
        int j=0;
        int pltu=m; //This marks the end of 'real' data in nums1
      
        while(j<n&&i<pltu){
            if(nums1[i]<=nums2[j]){
                i++;
            }
            else{
                int current=nums2[j];
                for(int k=pltu;k>i;k--){
                    nums1[k]=nums1[k-1];
                }
                nums1[i]=current;
                
                pltu++; 
                i++;   
                j++;   
            }
        }
    
        while(j<n){
            nums1[pltu]=nums2[j];
            pltu++;
            j++;
        }
    }
};
