class Solution {
public:
    int divisorSubstrings(int num, int k) {
        int l = 0;
        int r = k - 1;
        string s = to_string(num);
        int cnt = 0;

        string str = "";
        for(int i = 0; i <= r; i++){
            str += s[i];
        }

        int val = stoi(str);
        if(val != 0 && num % val == 0)
            cnt++;

        l++; 
        r++;

        while(r < s.length()){
            str.erase(0, 1);
            str.push_back(s[r]);

            val = stoi(str);
            if(val != 0 && num % val == 0)
                cnt++;

            l++;
            r++;
        }
        return cnt;
    }
};
