class Solution {
public:
    int minCost(int n) {
        int a,b;
        int sum=0;
        int val=1;
        while(val<n){
            sum+=val;
            val++;
        }
        return sum;
        
    }
};©leetcode
