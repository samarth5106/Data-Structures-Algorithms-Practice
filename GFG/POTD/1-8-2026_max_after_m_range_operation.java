class Solution {
    public int findMax(int n, int[] a, int[] b, int[] k) {
        int diff[]=new int[n+1];

        for(int i=0;i<a.length;i++){
            int from=a[i];
            int to=b[i];
            int val=k[i];

            diff[from]+=val;
            if(to+1<n){
                diff[to+1]-=val;
            }
        }

        int maxi=0;
        int curr=0;

        for(int i=0;i<n;i++){
            curr+=diff[i];
            maxi=Math.max(maxi,curr);
        }

        return maxi;
    }
}
