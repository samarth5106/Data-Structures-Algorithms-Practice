#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> vec(n);
        for(int i=0;i<n;i++){
            cin>>vec[i];
        }
        if(n<2){
            cout<<"-1"<<endl;
            continue;
        }
        bool hoga=true;
        vector<int> ans;
        for(int i=0;i<n;i++){
            int val=vec[i];
            int j=i;
            while(j<n&&vec[j]==val){
                j++;
            }
            if(j-i==1){
                hoga=false;break;
            }
            ans.push_back(j);
            j--;
            while(i<j){
                ans.push_back(i+1);
                i++;
            }
            i=j;
        }
        if(hoga)
        {
            for(int h=0;h<n;h++){
                cout<<ans[h]<<" ";
            }
            cout<<endl;
        }
        else{
    
        cout<<"-1"<<endl;
        }
    }

}



        else{

        cout<<"-1"<<endl;
        }
    }

}


Approach (Hinglish):
Array `s` already non-decreasing order me diya hua hai, isliye same shoe size wale students
continuous groups me milenge. Condition ye hai ki kisi student ko apne hi shoes nahi
milne chahiye (`p[i] ≠ i`) aur usko milne wale shoes ka size uske size se chhota bhi nahi
hona chahiye (`s[p[i]] ≥ s[i]`). Is observation se clear hota hai ki agar kisi size ka
sirf ek hi student hai to valid shuffling possible nahi hai, kyunki usko kisi aur ka
chhota shoe mil jayega jo allowed nahi hai. Isliye har equal-size group me kam se kam
2 students hone chahiye. Har group ke andar hum cyclic shift kar dete hain, matlab
group ke students ko next wale student ke shoes de dete hain aur last student ko
group ke first student ke shoes. Isse kisi ko apne shoes nahi milte aur sabko
same size ke shoes milte hain, jo condition satisfy karta hai.
