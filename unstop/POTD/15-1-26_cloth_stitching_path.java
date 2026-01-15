public static long calculateMinThread(int M,int N,int T){
    long cells=(long)M*N;
    long turns=0;
    if(M>1&&N>1){
        turns=2L*(M-1);
    }
    return cells+turns*T;
}
