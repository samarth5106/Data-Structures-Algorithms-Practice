class Solution {
    public int minLights(int[] lights) {
        int n=lights.length;
        int cnt=0;
       // int i=0;
        int[] diff=new int[n+1];
        for(int i=0;i<n;i++){
            int v=lights[i];
            if(v>0){
                int l=Math.max(0,i-v);
                int r=Math.min(n-1,i+v);
                diff[l]++;
                if(r+1<n) diff[r+1]--;
            }
        }
        boolean[] covered=new boolean[n];
        int curr=0;
        for(int i=0;i<n;i++){
            curr+=diff[i];
            covered[i]=curr>0;
        }
        int ans=0;
        int i=0;
       while(i<n){
           if(covered[i]){
               i++;
               continue;
           }
           int len=0;
           while(i<n&&!covered[i]){
               len++;
               i++;
           }
           ans+=(len+2)/3;
       }
        return ans;
    }
}©leetcode
