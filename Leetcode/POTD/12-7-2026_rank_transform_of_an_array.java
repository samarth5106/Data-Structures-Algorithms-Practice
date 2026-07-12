
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ans=new int[arr.length];
        int[][] gvn=new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            gvn[i][0]=arr[i];
            gvn[i][1]=i;
        }
        Arrays.sort(gvn, (a, b) -> Integer.compare(a[0], b[0]));
        int val=1;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                ans[gvn[i][1]]=val;
                val++;
            }

            else{

                if(gvn[i-1][0]==gvn[i][0]){
                    ans[gvn[i][1]]=ans[gvn[i-1][1]];
                }
                else{
                    ans[gvn[i][1]]=val;
                    val++;
                }
            }
        }
        return ans;


    }
}
