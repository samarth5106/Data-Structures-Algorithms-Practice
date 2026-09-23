#include <bits/stdc++.h>
using namespace std;

bool perfect(int val){
    if(val<=0) return false;
    int r=round(sqrt(val));
    return r*r==val;
}
int dp[105][105][10005];
int solve(int i,int sum,int cnt,int currsum,const vector<int>& vec){
    if(i==vec.size()){
        if(perfect(cnt)&&perfect(vec.size()-cnt))
        return abs(2*currsum-sum);
        return 1e7;
    }
    if(dp[i][cnt][currsum]!=-1) return dp[i][cnt][currsum];
    int take=solve(i+1,sum,cnt+1,currsum+vec[i],vec);
    int nottake=solve(i+1,sum,cnt,currsum,vec);
    return dp[i][cnt][currsum]=min(take,nottake);
}
int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> vec(n);
        int sum=0;
        for(int i=0;i<n;i++){
            cin>>vec[i];
            sum+=vec[i];
           
        }
        int diff=INT_MAX;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                for(int s=0;s<=sum;s++){
                    dp[i][j][s]=-1;
                }
            }
        }
        diff=min(diff,solve(0,sum,0,0,vec));
        if(diff>=1e7) diff=-1;
        cout<<diff<<endl;
    
    }

}
