#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int kitne(int n) {
    // Base Case: If we reach 0, no more steps are needed
    if (n == 0) {
        return 0; 
    }

    int maxi = 0;
    string s = to_string(n);
    
    // Find the maximum digit in the current number
    for (char c : s) {
        maxi = max(maxi, c - '0');
    }

    // Recursive Step:
    // 1 (this step) + whatever steps it takes to solve (n - maxi)
    return 1 + kitne(n - maxi);
}

int main() {
    int n;
    if (!(cin >> n)) return 0;
    
    cout << kitne(n) << endl;
    return 0;
}
