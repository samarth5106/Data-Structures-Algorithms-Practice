class Solution {
    public int maxBuilding(int n,int[][] restrictions) {

        int m=restrictions.length;

        int[][] arr=new int[m+1][2];

        arr[0][0]=1;
        arr[0][1]=0;

        for(int i=0;i<m;i++){
            arr[i+1]=restrictions[i];
        }

        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));

        for(int i=1;i<=m;i++){
            arr[i][1]=Math.min(arr[i][1],
                    arr[i-1][1]+(arr[i][0]-arr[i-1][0]));
        }

        for(int i=m-1;i>=0;i--){
            arr[i][1]=Math.min(arr[i][1],
                    arr[i+1][1]+(arr[i+1][0]-arr[i][0]));
        }

        int ans=0;

        for(int i=1;i<=m;i++){

            int x1=arr[i-1][0];
            int h1=arr[i-1][1];

            int x2=arr[i][0];
            int h2=arr[i][1];

            int d=x2-x1;

            int peak=Math.max(h1,h2)+(d-Math.abs(h1-h2))/2;

            ans=Math.max(ans,peak);
        }

        int lastId=arr[m][0];
        int lastH=arr[m][1];

        ans=Math.max(ans,lastH+(n-lastId));

        return ans;
    }
}
