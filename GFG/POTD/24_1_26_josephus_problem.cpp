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
see my approac was this just refined by AI, wht i was doing was k=k%n, thinking what if k>n so we can do k%n=k,, but this was wrong we need to eliminate kth alive personn wach time so after eliminarting, the count is decreasing by 1 as we eliminated that person, so hmara ye appraoch of doing k%n is ok only or round 1 not everytime,,as after each time n is decreasing by 1,, and moreover what if k==, then k%n will be 0,, means we have to eliminate 0th alive person that makes no sense.

