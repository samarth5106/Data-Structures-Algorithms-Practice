class Solution {
public:
    int countPrimeSetBits(int left, int right) {
        int cnt=0;
        for(int i=left;i<=right;i++){
             int n=__builtin_popcount(i);
             int divi=0;
             for(int j=1;j*j<=n;j++){
                if(n%j==0){
                    divi++;
                    if(n/j!=j){
                        divi++;
                    }
                }
             }
             if(divi==2)
             cnt++;

        }
       return cnt;

    }
};
