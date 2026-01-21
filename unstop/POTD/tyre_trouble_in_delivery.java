public static int countEligibleBikes(int[][] tyres, int N, int T) {
    int count = 0;
    for(int i = 0; i < N; i++){
        if(tyres[i][0] <= T || tyres[i][1] <= T){
            count++;
        }
    }
    return count;
}
