class Solution {
public:
    int getLastDigit(string a,string b) {

        if(b=="0") return 1;

        int base=(a.back()-'0');

        vector<int> cycle;

        int cur=base;

        do{
            cycle.push_back(cur);
            cur=(cur*base)%10;
        }while(cur!=base);

        int len=cycle.size();

        int pos=0;

        for(char c:b){
            pos=(pos*10+(c-'0'))%len;
        }

        if(pos==0) pos=len;

        return cycle[pos-1];
    }
};
