#include<bits/stdc++.h>
using namespace std;
int main(){
int t;
cin>>t;
while(t--){
    int n;
    cin>>n;
    vector<int> a(n);
    int ans;
   int sum=0;
    for(int i=0;i<n;i++){
        cin>>a[i];
        sum+=a[i];
        if(i==0){ ans=a[i];}
        if(i>0) ans=ans^a[i];
    }
    if(sum==0){
        cout<<"0"<<endl;continue;
    }
    if(ans==0)
//means n is even;
        { cout<<"1"<<endl;
    cout<<"1"<<" "<<n<<endl;
     continue;
     }
    if(n%2==1){
        cout<<"4"<<endl;
    cout<<"1"<<" "<<n<<endl;
    cout<<"2"<<" "<<n<<endl;
     cout<<"1"<<" "<<"2"<<endl;
     cout<<"1"<<" "<<n<<endl;continue;

    }
    cout<<"2"<<endl;
    cout<<"1"<<" "<<n<<endl;
     cout<<"1"<<" "<<n<<endl;
}
}
