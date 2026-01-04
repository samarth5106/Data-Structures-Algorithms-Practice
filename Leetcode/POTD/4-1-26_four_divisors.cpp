class Solution {
public:
    int sumFourDivisors(vector<int>& nums) {
        int cnt=2;
        int sum_divsor=0;
        int total=0;
        for(int j=0;j<nums.size();j++){
            cnt=2;
            sum_divsor=1+nums[j];
             for(int i=2;i*i<=nums[j];i++){
                if(nums[j]%i==0){
                    cnt++;
                    sum_divsor+=i;
                    if(i!=nums[j]/i){
                    cnt++;
                    sum_divsor+=nums[j]/i;
                }
                    
                }
                if(cnt>4)
                break;
        }
        if(cnt==4){
            total+=sum_divsor;
        }
    }
    return total;
       
    }
};
