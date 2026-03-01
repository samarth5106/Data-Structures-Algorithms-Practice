#include <bits/stdc++.h>
using namespace std;

int main() {

        int n;
        cin>>n;
       int d;
       cin>>d;
       vector<int> p(n);
       for(int i=0;i<n;i++){
           cin>>p[i];
       }
       int cnt=0;
       sort(p.begin(),p.end(),greater<int>());
       int sum=0;
      int l=0,r=n-1;
      int leader;
      while(r>l){
         // maxi=p[l];
         leader=p[l];
         int need=(d/leader)+1;
         if(need==1){
             l++;cnt++;continue;
         }
         else if(need>1) {
             need--;
           
            if(r-need>=l){
                 r-=need;
             cnt++;
            }
            
         }
         l++;
      }
       //if(sum>d) cnt++;
       cout<<cnt<<endl;
       
        
        
    

}
