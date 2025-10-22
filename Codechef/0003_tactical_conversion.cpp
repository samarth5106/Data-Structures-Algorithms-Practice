#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin >> t;
	while(t--){
	    int n;
	    cin >> n;
	    string s;
	    cin >> s;
	    vector<int>counts;
        int cnt = 0;
        for (char c : s) {
            if (c == '1') cnt++;
            else if (cnt > 0) {
            counts.push_back(cnt);
            cnt = 0;
        }
    }

    if (cnt > 0) counts.push_back(cnt);

    if(counts.size()==1){
        if(counts[0] == 3 || counts[0] == 2) cout << "NO" << endl;
        else cout << "YES" << endl;
    }
    else cout << "YES" << endl;
}

}
