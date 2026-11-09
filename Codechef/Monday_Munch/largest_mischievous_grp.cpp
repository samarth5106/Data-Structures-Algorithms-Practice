#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
   
        int n;
        cin>>n;
       string s;
       cin>>s;
       //n columns
       int l=0;
       int r=0;
       int strt=-1;
       int end=-1;
       int maxi=0;
       int mayend=-1;
       int maystrt=-1;
       while(r<n){
           
           if(s[r]=='m'){
               if(maystrt==-1) maystrt=r;
               mayend=r;
           }
           if(s[r]=='g'){
               
               if(maystrt!=-1){
                   int len=mayend-maystrt+1;
             
               if(maxi<len){
                   maxi=len;
                   strt=maystrt;
                   end=mayend;
                   
               }
               maystrt=-1;
               }
               
               mayend=-1;
               
               l=r+1;
           }
           r++;
       }
       if(maystrt!=-1){
           int len=mayend-maystrt+1;
           if(maxi<len){
               maxi=len;
               strt=maystrt;
               end=mayend;
           }
       }
       
       
       cout<<strt<<" "<<end<<endl;
        
        
    

}
