#include<bits/stdc++.h>
using namespace std;


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
        if(n==1){
            cout<<"0"<<endl;continue;        }
bool good = true;
for(int i = 0; i < n; i++){
    if(i % 2 != a[i] % 2){
        good = false;
        break;
    }
}
  int operations = 0;
        int count = 1;
if(!good){


        for(int i = 1; i < n; i++){
            if(a[i] % 2 == a[i-1] % 2){
                count++;
            } else {
                operations += (count - 1);
                count = 1;
            }
        }
}
     operations += (count - 1);
   
        cout << operations << endl;

    }
}
