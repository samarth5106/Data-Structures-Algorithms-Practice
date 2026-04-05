class Solution {
public:
    int mirrorFrequency(string s) {
        unordered_map<char,int> unmp;
        for(int i=0;i<s.length();i++){
            unmp[s[i]]++;
        }
        unordered_set<char> vis;
        int sum=0;
        for(auto it:unmp){
            char c=it.first;
            if(vis.count(c)) continue;
            char m;
            if(c>='a'&&c<='z'){
                m='a'+('z'-c);
            }
            else{
                m='0'+('9'-c);
            }
            int f1=unmp[c];
            int f2=0;
            if(unmp.count(m)) f2=unmp[m];
            sum+=abs(f1-f2);
            vis.insert(c);
            vis.insert(m);
        }
        return sum;
    }
};
