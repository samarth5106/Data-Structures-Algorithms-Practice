#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
        int atmax=200000;
        vector<bool> sieve(atmax,true);
        vector<long long> primes;
        sieve[0]=false;
        sieve[1]=false;
        for(int i=2;i<atmax;i++){
            if(sieve[i]==true){
                primes.push_back(i);
                for(long long j=1LL*i*i;j<atmax;j+=i){
                    sieve[j]=false;
                }
            }
        }
        
        while(t--){
            int n;
            cin>>n;
            for(int i=0;i<n;i++){
                cout<<primes[i]*primes[i+1]<<" ";
                
            }
            cout<<endl;
            
        }
                
        
    

}
