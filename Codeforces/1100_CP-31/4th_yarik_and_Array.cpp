#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> vec(n);
        cin>>vec[0];
        int maxi=vec[0];
        for(int i=1;i<n;i++){
            cin>>vec[i];
            if(vec[i]>maxi)maxi=vec[i];
        }
        int l=0;
        int r=1;
        int sum=vec[0];
        while(r<n){
            maxi=max(maxi,sum);
            int rem1=abs(vec[r]%2);
            int rem2=abs(vec[r-1]%2);
            if(rem1==rem2){
                l=r;
                sum=vec[r];
            }else{
                if(sum<0){
                    l=r;
                    sum=vec[r];
                }else{
                    sum+=vec[r];
                }
            }
            maxi=max(maxi,sum);
            r++;
        }
        cout<<maxi<<"\n";
    }
    return 0;
}
