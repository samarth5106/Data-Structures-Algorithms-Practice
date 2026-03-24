class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        sort(nums.begin(),nums.end());

        int n=nums.size();
        
        vector<vector<int>> ans;
        if(n<4) return ans;
        else if(n==4){
            long long s=0;
            for(int i=0;i<4;i++){
                s+=nums[i];
            }
            if(s==target){
                ans.push_back(nums);
            }
            return ans;
        }
       // bool allsm=true;;
        // seee it is like two sum kko 2 baar lgana hai ,, nums[i]+nums[j]=-(nums[i]+nums[j])
        for(int i=0;i<nums.size();i++){
            
           if(i > 0 && nums[i] == nums[i-1]) continue;
            int v1=nums[i];
            for(int j=i+1;j<nums.size();j++){
               // allsm=false;
                if(j>i+1&&nums[j]== nums[j-1]) continue;
            
            int v2=nums[j];
            int left=j+1;
            int right=n-1;
            while(left<right){
                long long sum=(long long)v1+(long long)v2+(long long)nums[left]+(long long)nums[right];
                if(sum==target){
                    vector<int> yo={v1,v2,nums[left],nums[right]};
                    ans.push_back(yo);
                    left++;
                    right--;
                    while(left<right&&nums[left]==nums[left-1]){
                        left++;
                    }
                    while(right>left&&nums[right]==nums[right+1]){
                        right--;
                    }
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
                
            }
            }
        }
        
        return ans;
    }
};
