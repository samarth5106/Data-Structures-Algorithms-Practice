class Solution {
  public:
    int countSubstr(string& s, int k){
        // Count substrings with exactly k unique = atMostK(k) - atMostK(k-1)
        return atMostK(s, k) - atMostK(s, k - 1);
    }
    
    int atMostK(string& s, int k){
        if(k == 0) return 0;
        
        int l = 0;
        int check[123] = {0};
        int cnt = 0, discnt = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(check[s[i]] == 0) discnt++;
            check[s[i]]++;
            
            while(discnt > k){
                check[s[l]]--;
                if(check[s[l]] == 0) discnt--;
                l++;
            }
            
            cnt += i - l + 1;  // ✅ Remove if(discnt==k) check
        }
        return cnt;
    }
};
