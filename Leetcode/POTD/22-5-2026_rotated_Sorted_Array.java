class Solution {
    
    int transition(int[] nums){

        int low=0;
        int high=nums.length-1;

        while(low<high){

            int mid=low+(high-low)/2;

            if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }

        return low;
    }

    public int search(int[] nums,int target) {
        
        int low=0;
        int idx=transition(nums);

        int high=idx-1;

        int l2=idx;
        int hg2=nums.length-1;

        while(low<=high){
            
            int mid=(low+high)/2;
            
            if(nums[mid]==target) return mid;
            
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        while(l2<=hg2){
            
            int mid=(l2+hg2)/2;
            
            if(nums[mid]==target) return mid;
            
            else if(nums[mid]>target){
                hg2=mid-1;
            }
            else{
                l2=mid+1;
            }
        }

        return -1;
    }
}
