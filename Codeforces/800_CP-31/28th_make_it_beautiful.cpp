#include<bits/stdc++.h>
using namespace std;

bool isBeautiful(vector<int>& a){
    long long sum = 0;
    for(int i = 0; i < a.size(); i++){
        if(a[i] == sum){
            return false;
        }
        sum += a[i];
    }
    return true;
}

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        vector<int> a(n);
        
        for(int i = 0; i < n; i++){
            cin >> a[i];
        }
        
        sort(a.begin(), a.end(), greater<int>());
        
        if(isBeautiful(a)){
            cout << "YES" << endl;
            for(int x : a) cout << x << " ";
            cout << endl;
            continue;
        }
        
        bool fixed = false;
        for(int i = 1; i < n; i++){
            if(a[i] == a[i-1]){
             
                for(int j = i + 1; j < n; j++){
                    if(a[j] != a[i]){
                        swap(a[i], a[j]);
                        if(isBeautiful(a)){
                            fixed = true;
                            break;
                        }
                        swap(a[i], a[j]);
                    }
                }
                if(fixed) break;
            }
        }
        
        if(isBeautiful(a)){
            cout << "YES" << endl;
            for(int x : a) cout << x << " ";
            cout << endl;
        } else {
            cout << "NO" << endl;
        }
    }
    return 0;
}
