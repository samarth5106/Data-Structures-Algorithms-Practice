#include <iostream>
using namespace std;
long long power(long long base,long long exp){
    long long res=1;
    long long MOD=1e9+7;
    base%=MOD;
    while(exp>0){
        if(exp%2==1)res=(res*base)%MOD;
        base=(base*base)%MOD;
        exp/=2;
    }
    return res;
}
long long modInverse(long long n){
    long long MOD=1e9+7;
    return power(n,MOD-2);
}
class Solution {
public:
    int computeValue(int n) {
        long long MOD=1e9+7;
        long long num=1,den=1;
        for(int i=1;i<=n;i++){
            num=(num*(n+i))%MOD;
            den=(den*i)%MOD;
        }
        long long ans=(num*modInverse(den))%MOD;
        return (int)ans;
    }
};
