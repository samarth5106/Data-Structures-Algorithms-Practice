#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        
        long long x,y,k;
        cin>>x>>y>>k;
        //  to make k torches, so k sticks and k coal or_eq
        // can get x-1 sticks any no. of time
        // k*y sticks togive toget k coals 
        // so k operations to get k coals
        
        // now handling sticks, stiks req=(k*y+k)/x-1
        long long total_sticks = k*y + k;
        long long extra_needed = total_sticks - 1;      
        long long net_profit = x - 1;

// Ceil division formula applied on your logic
        long long stick_trades = (extra_needed + net_profit - 1) / net_profit;

        long long tot= k + stick_trades;
        cout<<tot<<endl;
        
    }

}
