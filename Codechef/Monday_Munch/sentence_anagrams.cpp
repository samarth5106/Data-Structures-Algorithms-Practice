#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    string f;
    getline(cin,f);
    string s;
    getline(cin,s);
    
    
 
    map<string,int> mp;
    string wrd="";
    int i=0;
    while(i<f.length()){
        wrd="";
        while(i<f.length()&&isalpha(f[i])){
             wrd+=tolower((unsigned char)f[i]);
            i++;
        }
        if(!wrd.empty())
        mp[wrd]++;
       while (i<f.length()&&!isalpha((unsigned char)f[i]))
        i++;
    }
    wrd="";
    map<string,int> mp2;
    i=0;
      while(i<s.length()){
        wrd="";
        while(i<s.length()&&isalpha(s[i])){
            wrd+=tolower((unsigned char)s[i]);
            i++;
        }
        if(!wrd.empty())
        mp2[wrd]++;
       while (i<s.length()&&!isalpha((unsigned char)s[i]))
        i++;
    }
   
   
//     if(mp.size()!=mp2.size()){
//         cout<<"The sentences are not anagrams"<<endl;
//         return 0;
//     }
//     for(auto&pair:mp){
//         string word=pair.first;
//         if(mp2[word]!=mp[word]){
//             cout<<"The sentences are not anagrams"<<endl;
//             return 0;
// //break;
//         }
//     }
if(mp==mp2)
    cout<<"The sentences are anagrams."<<endl;
    else  cout<<"The sentences are not anagrams."<<endl;
    
    

}
