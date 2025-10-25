class Solution {
public:
    string maxSumOfSquares(int num, int sum) {
        string ans = "";
        int maxSum = num * 9;
        if(sum > maxSum || sum < 0){
            return ans;
        }
    
        for(int i = 0; i < num; i++){
            ans += '9';
        }
        
        int tominus = maxSum - sum;

        int zerosNeeded = tominus / 9;
        int remainder = tominus % 9;
        for(int i = num - 1; i >= num - zerosNeeded; i--){
            ans[i] = '0';
        }
        if(remainder > 0){
            int pos = num - zerosNeeded - 1;
            ans[pos] = (char)('0' + 9 - remainder);
        }
        
        return ans;
    }
};
