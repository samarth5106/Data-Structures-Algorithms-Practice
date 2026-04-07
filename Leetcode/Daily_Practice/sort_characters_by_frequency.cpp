class Solution {
public:
    string frequencySort(string s) {
        vector<int> vec(256);
        for(char x:s){
            vec[x]++;
        }
        vector<pair<int,int>> ordrd;
        for(int i=0;i<256;i++){
            if(vec[i]!=0){
                ordrd.push_back({i,vec[i]});
            }
        }
        sort(ordrd.begin(),ordrd.end(),[](pair<int,int> a,pair<int,int> b){
            if(a.second==b.second){
                return a.first<b.first;
            }
                return a.second>b.second;
        });
       // sort(vec.begin(),vec.end(),greater<int>());
        string ans="";
        for(int i=0;i<ordrd.size();i++){
            while(ordrd[i].second--){
                ans+=ordrd[i].first;
            }
        }
        return ans;

        
    }
};
