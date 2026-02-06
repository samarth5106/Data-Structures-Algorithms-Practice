import java.util.Arrays;
class Solution{
    int[] smallestDiff(int a[],int b[],int c[]){
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int i=0,j=0,k=0;
        int best=Integer.MAX_VALUE;
        int sa=0,sb=0,sc=0;
        while(i<a.length&&j<b.length&&k<c.length){
            int mx=Math.max(a[i],Math.max(b[j],c[k]));
            int mn=Math.min(a[i],Math.min(b[j],c[k]));
            int diff=mx-mn;
            if(diff<best){
                best=diff;
                sa=a[i];
                sb=b[j];
                sc=c[k];
            }
            if(mn==a[i]) i++;
            else if(mn==b[j]) j++;
            else k++;
        }
        int[] ans=new int[3];
        ans[0]=Math.max(sa,Math.max(sb,sc));
        ans[2]=Math.min(sa,Math.min(sb,sc));
        ans[1]=sa+sb+sc-ans[0]-ans[2];
        return ans;
    }
}
