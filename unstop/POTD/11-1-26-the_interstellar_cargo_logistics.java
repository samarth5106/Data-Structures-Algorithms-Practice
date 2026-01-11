import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int k=sc.nextInt();

        if(k>n){
            System.out.println(-1);
            return;
        }

        int INF=1000000000;
        int[][] dp=new int[k+1][n+1];
        for(int i=0;i<=k;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=INF;
            }
        }

        dp[0][0]=0;

        for(int i=1;i<=k;i++){
            for(int j=i;j<=n;j++){
                int mx=0;
                for(int p=j;p>=i;p--){
                    mx=Math.max(mx,a[p-1]);
                    dp[i][j]=Math.min(dp[i][j],dp[i-1][p-1]+mx);
                }
            }
        }

        int ans=dp[k][n];
        if(ans>=INF) System.out.println(-1);
        else System.out.println(ans);
    }
}
