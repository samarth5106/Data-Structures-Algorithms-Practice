import java.util.Arrays;
class Solution {
    public int josephus(int n, int k) {
        boolean[] hash = new boolean[n+1];
        Arrays.fill(hash,true);

        int now = 1;
        int sz = n;

        while(sz != 1){
            int cnt = 0;

            // count k alive people
            while(cnt < k){
                if(hash[now]){
                    cnt++;
                }
                if(cnt == k) break;
                now++;
                if(now > n) now = 1;
            }

            // eliminate
            hash[now] = false;
            sz--;

            // move to next alive
            do{
                now++;
                if(now > n) now = 1;
            }while(hash[now] == false);
        }

        int i;
        for(i = 1; i <= n; i++){
            if(hash[i]){
                break;
            }
        }
        return i;
    }
}
