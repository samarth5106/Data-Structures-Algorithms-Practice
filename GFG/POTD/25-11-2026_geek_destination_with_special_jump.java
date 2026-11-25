class Solution {
    long mod=1000000007;

    long normal(long x,int a,int b){
        if(x<=a) return x;
        long p=a-b;
        long k=(x-a+p-1)/p;
        return x+2L*b*k;
    }

    long sumNormal(long l,long r,int a,int b){
        if(l>r) return 0;

        long ans=0;

        if(l<=a){
            long end=Math.min(r,(long)a);
            ans+=(end-l+1)*(l+end)/2;
            l=end+1;
        }

        if(l>r) return ans;

        int p=a-b;

        for(int rem=0;rem<p;rem++){
            long first=l+(rem-l%p+p)%p;

            if(first>r) continue;

            long cnt=(r-first)/p+1;
            long k=(first-a+p-1)/p;

            long sumX=cnt*first+((cnt*(cnt-1)/2)*p);
            long sumK=cnt*k+cnt*(cnt-1)/2;

            ans+=sumX+2L*b*sumK;
        }

        return ans;
    }

    public int minTime(int a,int b,int d,int l,int r) {
        long normalD=normal(d,a,b);
        long L=d-r;
        long R=d-l;

        long lo=L,hi=R,cut=L-1;

        while(lo<=hi){
            long mid=lo+(hi-lo)/2;

            if(normal(mid,a,b)<=normalD-2){
                cut=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }

        long cnt1=Math.max(0,cut-L+1);
        long cnt2=R-L+1-cnt1;

        long ans=sumNormal(L,cut,a,b)+cnt1;
        ans+=cnt2*normalD;

        return (int)(ans%mod);
    }
}
