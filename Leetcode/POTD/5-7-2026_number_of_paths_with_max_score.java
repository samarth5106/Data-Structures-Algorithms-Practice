import java.util.*;

public class Solution {
    public int[] pathsWithMaxScore(List<String> board) {
        //max sum of numeric characters =maxi
        //numberof way to get sum ==maxi

        int[] ans=new int[2];
        String last=board.get(board.size()-1);
        int[][] dp=new int[board.size()+1][last.length()+1];
       
        for(int i=0;i<=board.size();i++){
            for(int j=0;j<=last.length();j++){
                Arrays.fill(dp[i],-100000000);
            }
        }

        dp[0][0]=0;

        for(int i=1;i<=board.size();i++){
            for(int j=1;j<=last.length();j++){
                // 1. Handle Obstacles: if current cell is 'X', it is unreachable
                if (board.get(i-1).charAt(j-1) == 'X') {
                    dp[i][j] = -100000000;
                    continue;
                }

                // 2. Safely get the numeric value of the current cell ('S' and 'E' give 0 points)
                char currChar = board.get(i-1).charAt(j-1);
                int cellVal = (currChar == 'S' || currChar == 'E') ? 0 : (currChar - '0');

                int up = cellVal + dp[i-1][j];
                int diag = cellVal + dp[i-1][j-1];
                int lft = cellVal + dp[i][j-1];

                dp[i][j]=Math.max(up,Math.max(diag,lft));
            }
        }

        int maxi=dp[board.size()][last.length()];
        
        // If the destination 'S' (bottom-right) is unreachable from 'E', return [0,0]
        if(maxi<0)
            return ans;
        ans[0]=maxi;

        int[][][] dpw=new int[board.size()+1][last.length()+1][maxi+1];
        dpw[0][0][0] = 1; 

        for(int i=1;i<=board.size();i++){
            for(int j=1;j<=last.length();j++){
                // Skip obstacles in path counting too
                if (board.get(i-1).charAt(j-1) == 'X') {
                    continue;
                }

                char currChar = board.get(i-1).charAt(j-1);
                int cellVal = (currChar == 'S' || currChar == 'E') ? 0 : (currChar - '0');

                for(int sum=0;sum<=maxi;sum++){
                    int diag=0;
                    int up=0;
                    int lft=0;
                     
                    if (sum - cellVal >= 0) {
                        up = dpw[i-1][j][sum - cellVal];
                        diag = dpw[i-1][j-1][sum - cellVal];
                        lft = dpw[i][j-1][sum - cellVal];
                    }

                    dpw[i][j][sum]=(up+diag+lft)%((int)1e9+7);
                }
            }
        }

        int wys=dpw[board.size()][last.length()][maxi];
        ans[1]=wys;
        return ans;
    }
}
