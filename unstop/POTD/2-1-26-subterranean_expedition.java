import java.util.*;

public class Main {
    public static int maxArtifactValue(int N, int M, int K, int[] caveValues, List<int[]> tunnels) {

        ArrayList<ArrayList<Integer>> g=new ArrayList<>();
        for(int i=0;i<N;i++) g.add(new ArrayList<>());
        for(int[] e:tunnels){
            g.get(e[0]).add(e[1]);
            g.get(e[1]).add(e[0]);
        }
        int NEG=-1000000000;
        int[][] dp=new int[K+1][N];
        for(int i=0;i<=K;i++){
            for(int j=0;j<N;j++){       dp[i][j]=NEG;
            }
        }
        dp[0][0]=caveValues[0];
        for(int step=0;step<K;step++){
            for(int u=0;u<N;u++){
                if(dp[step][u]==NEG) continue;
                for(int v:g.get(u)){
           dp[step+1][v]=Math.max(dp[step+1][v],dp[step][u]+caveValues[v]);
                }   }
        }
        int best=NEG;
        for(int i=0;i<=K;i++){
         best=Math.max(best,dp[i][N-1]);
        }
 if(best==NEG) return -1;
        return best;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        int[] caveValues = new int[N];
        for (int i = 0; i < N; i++) {
            caveValues[i] = scanner.nextInt();
        }

        List<int[]> tunnels = new ArrayList<int[]>();
        for (int i = 0; i < M; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            tunnels.add(new int[] {u, v});
        }

        int result = maxArtifactValue(N, M, K, caveValues, tunnels);
        System.out.println(result);
    }
}
