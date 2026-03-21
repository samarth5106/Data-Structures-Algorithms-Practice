#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--) {
        int n;
        cin>>n;
        vector<long long> a(n);
        for(int i=0; i<n; i++){
            cin>>a[i];
        }

        for(int i=0; i<n; i++) {
            vector<pair<double, int>> events;
            int curcnt = 0;

            for(int j=i+1; j<n; j++) {
                if(a[i] == a[j]) continue;

                double mid = (a[i] + a[j]) / 2.0;
                if(a[i] > a[j]) {
                    curcnt++;
                    events.push_back({mid, -1});
                } else {
                  
                    events.push_back({mid, 1});
                }
            }

            sort(events.begin(), events.end());

            int maxxaati= curcnt;
            for(int i=0; i<events.size(); i++) {
               
                curcnt += events[i].second;
                maxxaati= max(maxxaati, curcnt);
            }
            
            cout<<maxxaati<<" ";
        }
        cout<<endl;
    }
    return 0;
}
