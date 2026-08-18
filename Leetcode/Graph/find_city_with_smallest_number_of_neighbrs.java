
class Solution {
    public int findTheCity(int n, int[][] edges, int dt) {

        int[][] cost=new int[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(cost[i],(int)1e5);
        }

        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int wt=edges[i][2];
            cost[u][v]=wt;
            cost[v][u]=wt;
            cost[u][u]=0;
            cost[v][v]=0;
        }

        for(int via=0;via<n;via++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    cost[i][j]=Math.min(cost[i][j],cost[i][via]+cost[via][j]);
                }
            }
        }

        int mini=n;
        int ans=0;
        for(int i=n-1;i>=0;i--){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(cost[i][j]<=dt) cnt++;
            }
            if(mini>cnt){
                mini=cnt;
                ans=i;
            }
        }

        return ans;
    }
}
