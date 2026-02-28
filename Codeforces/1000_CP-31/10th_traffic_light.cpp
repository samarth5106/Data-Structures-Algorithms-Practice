#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        char c;
        cin>>c;
        string s;
        cin>>s;

        int ans=0;
       
        vector<int> green;
        s=s+s;
        if(c=='g'){
        cout<<ans<<endl;continue;}
        for(int i=0;i<s.length();i++){
         if(s[i]=='g'){
             green.push_back(i);
         }   
    }
    
        for(int i=0;i<n;i++){  
    if(s[i]==c){
        int l=0,h=green.size()-1;
        int best=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(green[mid]>i){
                best=green[mid];
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        if(best!=-1){
            ans=max(ans,best-i);
        }
    }
}
        cout<<ans<<endl;
        
    }

}


My First approach - see maine pahle jaisa bola gaya tha vaisa Implementation kia which Got me TLE ,,

Correct Approach - see the correct way is to use Binary Search see we need to find the maximum distance from any c to next g (circularly) ,, we are using binary search we want
to quckly find the next 'g' after it so if we store alll indices of g in a array nsorted way mein then for a position i we can use binary search to find the index in which g is 
present and its index is also greater than i,,

so make string double ,, that is s=s+s,, so circular issue solve ho gya ,,
then, now store all positions of g in vector 'green' ,, for every positions i where s[i]==c apply Binary search in that 'green' vectorfind first index of 'g' >i

and the distance from the index of c (i) will be green_index-i
