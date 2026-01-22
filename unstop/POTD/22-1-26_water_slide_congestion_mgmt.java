public static int maxTotalPopularity(int[] P,int N){
    if(N==0)return 0;
    int p0=0;
    int p1=Math.max(0,P[0]);
    for(int i=1;i<N;i++){
        int cur=Math.max(p1,p0+P[i]);
        cur=Math.max(cur,0);
        p0=p1;
        p1=cur;
    }
    return p1;
}
