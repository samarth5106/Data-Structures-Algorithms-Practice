#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin >> t;
    while(t--){
        int n, m;
        cin >> n >> m;
        if((m-n)%2 ||m< n) cout << "no" << endl;
        else{
            int g=(m-n)/2;
            if(g<=n) {
                cout << "YeS" << endl;
            }
            else cout<<"No"<<endl;
        }
    }
}
