#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        long long k;
        cin>>n>>k;
        
        vector<pair<long long,int>>v;
        
        for(int i=1;i<=n;i++){
            long long a;
            cin>>a;
            long long r=a%k;
            if(r==0) r=k;
            v.push_back({r,i});
        }
        
        sort(v.begin(),v.end(),[](auto &a,auto &b){
            if(a.first==b.first) return a.second<b.second;
            return a.first>b.first;
        });
        
        for(int i=0;i<n;i++){
            cout<<v[i].second<<" ";
        }
        cout<<endl;
    }
}


My previous approach- see hamea har bar max element rom array chunna hai and use k se decrease karna hai if it becomes <=0 then ussko aur k se decrease nhi krna hai ,,
 so i used Priority queue as it allows dulicates and  also hmesha max element sabse upar dega and its elements were pair {element, index} so mne usme elememts input lie 
in form of pair with its index , and then made an 'answer' vector to return having indices ,, so used while loop till tyhe size of that answer vector is not getting equal to the 
size of the number of monsters ,, so inside that while loop mne pq.top.first element lie if it is not <=0 then i decremented it by k and checked whether vo <=0 se bna hai ya nahi 
after that decrement if bne hai then put its index means pq.top.second inside that 'answer' vector ,, so aisa chalte gya but the issue was 
if there are 2 pairs having same pair.first value means health of monster then we have to give priority to that health having smaller index but priority iska ulta krta hai 
it means it gives piority to that health who is having bigger index so for that we use Custom comparator ,, and 
2nd issue was TLE if k==1 ,and health is 10^9 then TLE ,, so hame approach badalni hogi

Correct Logic : see hamne har health value ka % lia k ke sath and usko ek vactor me store kia with forming a pair like {element,index},, 
so modulo karne se hame vo last health of the monster mill gayi jiske bad if hamne again decrement kia by k he will die means the health of the monster in the last round,,
if that modulo gives us answer 0 it means that the health is divisible by k so in last roundthe health will be equal to k,, so hamne harr health ko modulo k kia and vector me bhara,,
then we sorted that vector in descending order along with taking care f the fact when 2 pairs having same health in last rounf we have to give priority to lower index vla elmnt ,, 
then  used loop and just printed the pair.second means indeices.
