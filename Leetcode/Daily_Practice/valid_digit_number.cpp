class Solution {
public:
    bool validDigit(int n, int x) {
        
        bool isit=false;
        while(n!=0){
            int digit=n%10;
            n=n/10;
            if(digit==x&&n==0) isit=false;
            if(digit==x&&n!=0)
                isit=true;
        }
        return isit;
        
    }
};©leetcode
