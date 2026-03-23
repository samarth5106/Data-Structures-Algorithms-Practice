#include <bits/stdc++.h>
using namespace std;

bool isPrime(long long x){
    if(x < 2) return false;
    for(long long i = 2; i * i <= x; i++){
        if(x % i == 0) return false;
    }
    return true;
}

long long nextPrime(long long x){
    while(!isPrime(x)){
        x++;
    }
    return x;
}

int main(){
    int t;
    cin >> t;

    while(t--){
        long long d;
        cin >> d;

        long long p = nextPrime(1 + d);
        long long q = nextPrime(p + d);

        cout << p * q << endl;
    }
}
