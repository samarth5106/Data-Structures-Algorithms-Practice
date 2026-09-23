#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    

        int n;
        cin>>n;
        int t;
    cin>>t;
        vector<int> a(n);
        int modk=0;
        for(int i=0;i<n;i++){
            cin>>a[i];
            if(a[i]==1) modk++;
           
        }
        
        int mouse=0;
        int devote=0;
        int lst=-1;
        for(int hr=1;hr<=t;hr++){
            if((hr&1)==1){
                
                if(modk>0){
                    int seen=0;
                    int curr=mouse;
                  for(int step=0;step<2*n;step++){
                      if(a[curr]==1){
                          seen++;
                          if(seen==2){
                              a[curr]=0;
                              lst=curr;
                              mouse=(curr+1)%n;
                              modk--;
                              break;
                          }
                      }
                      curr=(curr+1)%n;
                  }
                    
                }
                
            }
            else{
                int i=devote;
                devote=(devote+1)%n;
                if(a[i]==0){a[i]=1;modk++;}
               else if(lst!=-1&&lst!=i){
                   int dir;
                   if(lst>i) dir=1;
                   else dir=-1;
                   for(int pos=i+dir;pos>=0&&pos<n;pos+=dir){
                       if(a[pos]==0){
                           a[pos]=1;
                           modk++;
                           break;
                       }
                   }
               }
            }
        }
        
        for(int i=0;i<n;i++){
            cout<<a[i];
            if(i==n-1)cout<<"";
            else cout<<" ";
        }
        return 0;
        
        
        
        
    

}
