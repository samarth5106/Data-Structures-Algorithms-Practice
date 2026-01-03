class Solution {
public:
    int numOfWays(int n) {
        const int MOD=1000000007;
        long long same=6, diff=6;

        for(int i=2;i<=n;i++){
            long long nsame=(same*3 + diff*2)%MOD;
            long long ndiff=(same*2 + diff*2)%MOD;
            same=nsame;
            diff=ndiff;
        }
        return (same+diff)%MOD;
    }
};
