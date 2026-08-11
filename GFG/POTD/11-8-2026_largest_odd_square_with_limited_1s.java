class Solution {
    ArrayList<Integer> largestSquare(int[][] mat,int[][] queries,int k) {
        int n=mat.length;
        int m=mat[0].length;

        int[][] pre=new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                pre[i][j]=mat[i-1][j-1]
                        +pre[i-1][j]
                        +pre[i][j-1]
                        -pre[i-1][j-1];
            }
        }

        ArrayList<Integer> ans=new ArrayList<>();

        for(int[] q:queries){
            int i=q[0];
            int j=q[1];

            int low=0;
            int high=Math.min(Math.min(i,j),Math.min(n-1-i,m-1-j));
            int best=-1;

            while(low<=high){
                int r=(low+high)/2;

                int r1=i-r;
                int c1=j-r;
                int r2=i+r;
                int c2=j+r;

                int ones=pre[r2+1][c2+1]
                        -pre[r1][c2+1]
                        -pre[r2+1][c1]
                        +pre[r1][c1];

                if(ones<=k){
                    best=r;
                    low=r+1;
                }
                else{
                    high=r-1;
                }
            }

            if(best==-1)
                ans.add(-1);
            else
                ans.add(2*best+1);
        }

        return ans;
    }
}
