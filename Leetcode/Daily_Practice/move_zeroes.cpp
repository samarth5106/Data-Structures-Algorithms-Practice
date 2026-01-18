class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int curnt=0;
        while(curnt<nums.size()&&nums[curnt]!=0){
            curnt++;
        }
        if(curnt==nums.size()-1)
        return ;
        for(int i=curnt+1;i<nums.size();i++){
            if(nums[i]!=0){
                swap(nums[i],nums[curnt]);
                curnt++;

        }
            }

        
    }
};
