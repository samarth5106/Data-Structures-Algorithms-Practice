

class Solution {
public:
    int divisorSubstrings(int num, int k) {
        int l = 0, r = k - 1;
        int cnt = 0;
        string val = to_string(num);
        
        for(int i = l; r < val.length(); i++) {
            int strt = i;
            int value = 0;
            while(strt <= r) {
                value = (value * 10) + (val[strt] - '0');
                strt++;
            }

            if(value != 0 && num % value == 0) {
                cnt++;
            }
          
            r++;
        }
        
        return cnt;
    }
};
