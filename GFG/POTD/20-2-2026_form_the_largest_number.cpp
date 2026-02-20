class Solution {
public:
    static bool checkr(string a,string b){
        return a+b>b+a;
    }
    
    string findLargest(vector<int> &arr){
        int n=arr.size();
        vector<string> v(n);
        for(int i=0;i<n;i++){
            v[i]=to_string(arr[i]);
        }
        sort(v.begin(),v.end(),checkr);
        if(v[0]=="0"){
            return "0";
        } 
        //return "0";
        string ans="";
        for(int i=0;i<n;i++){
            ans+=v[i];
    }
        return ans;
    }
};
