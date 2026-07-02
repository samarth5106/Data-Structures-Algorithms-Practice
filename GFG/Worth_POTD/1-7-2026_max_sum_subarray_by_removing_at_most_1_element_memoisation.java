class Solution{
public:

    vector<vector<int>> dp;

    int solve(int i,int used,vector<int>&arr){

        if(i==0){

            if(used==0) return arr[0];

            return -1000000000;
        }

        if(dp[i][used]!=INT_MIN)
            return dp[i][used];

        if(used==0){

            return dp[i][0]=max(
                arr[i],
                solve(i-1,0,arr)+arr[i]
            );
        }

        return dp[i][1]=max(
            solve(i-1,1,arr)+arr[i],
            solve(i-1,0,arr)
        );
    }

    int maxSumSubarray(vector<int>&arr){

        int n=arr.size();

        dp.assign(n,vector<int>(2,INT_MIN));

        int ans=arr[0];

        for(int i=0;i<n;i++){

            ans=max(ans,max(
                solve(i,0,arr),
                solve(i,1,arr)
            ));
        }

        return ans;
    }
};
