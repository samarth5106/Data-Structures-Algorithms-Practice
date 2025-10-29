#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    vector<pair<int, int>> arr(n);
    for(int i = 0; i<n; i++){
        cin>>arr[i].first;
        arr[i].second = i; 
    }
    sort(arr.begin(), arr.end());
    vector<long long> res(n);
    
    for(int i = 0; i < n; i++){
        if(i == 0){
           
            res[arr[i].second] = -1;
        }
        else if(i == n - 1){
           
            res[arr[i].second] = -1;
        }
        else{
        
            long long left_mid = arr[i-1].first + arr[i].first;
            long long right_mid = arr[i].first + arr[i+1].first;
        
            long long left_bound = left_mid / 2;
            long long right_bound = right_mid / 2;
            
    
            if(left_mid < 0 && left_mid % 2 != 0) left_bound--;
            if(right_mid < 0 && right_mid % 2 != 0) right_bound--;
            
            res[arr[i].second] = right_bound - left_bound;
        }
    }
    
    for(int i = 0; i < n; i++){
        cout << res[i]<<" ";
    }
    cout<<endl;

	    
	    
	}

}
