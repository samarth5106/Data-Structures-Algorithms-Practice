class Solution {
    public int countMonobit(int n) {
        int cnt=2;
        int val=2;
        int prev=1;
        if(n==1){
            return 2;
        }
        if(n==0)
        return 1;
        while(prev+val<=n){
cnt++;
prev=prev+val;
val=val*2;
            
        }
        return cnt;
    }
}
