#include <bits/stdc++.h>
using namespace std;

int max_sum_obtainable(const vector<int>& nums,int difference){
    int n=nums.size();
    vector<long long> dp0(n),dp1(n);
    long long ans=LLONG_MIN;
    for(int i=0;i<n;i++){
        dp0[i]=nums[i];
        dp1[i]=nums[i];
        for(int j=0;j<i;j++){
            if(abs(nums[i]-nums[j])<=difference){
                dp0[i]=max(dp0[i],dp0[j]+nums[i]);
                dp1[i]=max(dp1[i],dp1[j]+nums[i]);
            }else{
                dp1[i]=max(dp1[i],dp0[j]+nums[i]);
            }
        }
        ans=max(ans,max(dp0[i],dp1[i]));
    }
    return (int)ans;
}
