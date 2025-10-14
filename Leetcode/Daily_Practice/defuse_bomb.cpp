class Solution {
public:
    vector<int> decrypt(vector<int>& code, int k) {
        int n=code.size();
        int sum;
        vector<int> ans;
        if(k==0){
             vector<int> vec(n,0);
                return vec;
        }
        int j,cnt;
        int till=abs(k);
        for(int i=0;i<code.size();i++){
            sum=0;
            if(k>0){
                
                if(i==n-1){
                    j=0;
                }
                else{
                    j=i+1;
                }
                cnt=1;

                while(cnt<=till){
                   
                    sum+=code[j];
                    j++;
                     if(j==n){
                        j=0;
                    }
                    cnt++;
                }
                ans.push_back(sum);
            }
            else if(k<0){
              
                if(i==0){
                    j=n-1;
                }
                else{
                    j=i-1;
                }
                cnt=1;
                while(cnt<=till){
                    sum+=code[j];
                    j--;
                    if(j==-1){
                        j=n-1;
                    }
                    cnt++;
                    
                }
            
                 ans.push_back(sum);
            }
           
        }
        return ans;
    }
};
