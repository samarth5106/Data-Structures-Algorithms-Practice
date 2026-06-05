#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<long long> vec(n);
        long long mini=2e9;
        long long maxi=-2e9;
        for(int i=0;i<n;i++){
            cin>>vec[i];
            if(vec[i]<mini)mini=vec[i];
            if(vec[i]>maxi)maxi=vec[i];
        }
        long long ans=0;
        if(maxi!=mini){
            ans=abs(maxi-mini);
        }
        for(int k=2;k<=n/2;k++){
            if(n%k!=0)continue;
            long long max_truck=-2e18;
            long long min_truck=2e18;
            for(int i=0;i<n;i+=k){
                long long current_truck_sum=0;
                for(int j=i;j<i+k;j++){
                    current_truck_sum+=vec[j];
                }
                if(current_truck_sum>max_truck)max_truck=current_truck_sum;
                if(current_truck_sum<min_truck)min_truck=current_truck_sum;
            }
            long long current_diff=abs(max_truck-min_truck);
            if(current_diff>ans)ans=current_diff;
        }
        cout<<ans<<"\n";
    }
    return 0;
}
