
import java.util.*;

public class Main {
    static final int MOD = 1000000007;

    static int MOD=1000000007;

public static int countDistinctColorSequences(int n,int m,String[] grid){
    HashSet<String>[][] dp=new HashSet[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            dp[i][j]=new HashSet<>();
        }
    }

    dp[0][0].add(""+grid[0].charAt(0));

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            for(String s:dp[i][j]){
                if(i+1<n){
                    dp[i+1][j].add(s+grid[i+1].charAt(j));
                }
                if(j+1<m){
                    dp[i][j+1].add(s+grid[i].charAt(j+1));
                }
            }
        }
    }

    return dp[n-1][m-1].size()%MOD;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] grid = new String[N];
        for (int i = 0; i < N; i++) {
            grid[i] = scanner.nextLine();
        }
        int result = countDistinctColorSequences(N, M, grid);
        System.out.println(result);
    }
}
