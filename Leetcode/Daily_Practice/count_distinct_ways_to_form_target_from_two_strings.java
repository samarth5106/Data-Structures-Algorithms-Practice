class Solution {
    int MOD = 1_000_000_007;
    String word1, word2, target;

    public int interleaveCharacters(String word1, String word2, String target) {
        this.word1 = word1;
        this.word2 = word2;
        this.target = target;
        int[][][][][] dp=new int[word1.length()+1][word2.length()+1][target.length()+1][2][2];
        for(int i=0;i<=word1.length();i++){
            for(int j=0;j<=word2.length();j++){
                for(int k=0;k<=target.length();k++){
                    Arrays.fill(dp[i][j][k][1],-1);
                    Arrays.fill(dp[i][j][k][0],-1);
                }
            }
        }
        return solve(0, 0, 0, 0, 0,dp);
        //return (int)(ans % MOD);
    }

    int solve(int i, int j, int t, int u1, int u2,int[][][][][] dp) {
        int m = target.length();
        if (t == m) {
            return (u1==1 && u2==1) ? 1 : 0;
        }
        if(dp[i][j][t][u1][u2]!=-1) return dp[i][j][t][u1][u2];
        int total = 0;
        char need = target.charAt(t);

        // word1 me i se aage jaha bhi match mile, wahan se try karo
        for (int i2 = i; i2 < word1.length(); i2++) {
            if (word1.charAt(i2) == need) {
                total =( total+ solve(i2 + 1, j, t + 1, 1, u2,dp))% MOD;
            }
        }

        // word2 me j se aage jaha bhi match mile, wahan se try karo
        for (int j2 = j; j2 < word2.length(); j2++) {
            if (word2.charAt(j2) == need) {
                total =(total+ solve(i, j2 + 1, t + 1, u1, 1,dp))% MOD;
            }
        }

        return dp[i][j][t][u1][u2]=total;
    }
}
