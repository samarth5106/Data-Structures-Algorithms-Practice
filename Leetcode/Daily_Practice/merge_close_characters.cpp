class Solution {
public:
    string mergeCharacters(string s, int k) {
        //right merge to the left one
       
   bool hua=true;
     while(hua){
         hua=false;
          for(int i=0;i<s.length();i++){
            char c=s[i];
                for(int j=i+1;j<s.length();j++){
                if(s[j]==c&&j-i<=k){
                    s.erase(j,1);
                    hua=true;break;
                }
            }
            if(hua) break;
        }
     }
        
        return s;
        
    }
};©leetcode
