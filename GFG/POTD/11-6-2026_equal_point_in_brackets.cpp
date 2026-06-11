class Solution {
  public:
    int findIndex(string &s) {
      //  int ans;
        int i=0;
        int opn=0,cls=0;
        int j=s.length()-1;
        int previ=-1,prevj=-1;
        while(i<=j){
           if(s[i]=='('&&i!=previ) opn++;
           if(s[j]==')'&&j!=prevj)cls++;
           previ=i;
           prevj=j;
            if(opn>cls){
                j--;
            } 
            else if(opn<cls) {
                i++;
            }
            else{
                j--;
                i++;
            }
        }
        return i;
        
    }
};
        // code here
        
