public static int count_parity_flipped_subarrays(int n,long k,int[] arr){
    long[] zz=new long[n];
    for(int i=0;i<n;i++){
        if(arr[i]%2==0)zz[i]=arr[i]+1;
        else zz[i]=arr[i]-1;
    }
    HashMap<Long,Integer> hm=new HashMap<>();
    hm.put(0L,1);
    long sm=0;
    int res=0;
    for(int i=0;i<n;i++){
        sm+=zz[i];
        if(hm.containsKey(sm-k))res+=hm.get(sm-k);
        hm.put(sm,hm.getOrDefault(sm,0)+1);
    }
    return res;
}

