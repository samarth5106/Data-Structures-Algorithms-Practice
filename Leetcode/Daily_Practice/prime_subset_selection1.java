class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        //all prime<=n
        //select those primes
        
        //sum(primes) <=s
        //no(primes) =max
    
        List<Integer> ans=new ArrayList<>();
        if(n<2||s<2) return ans;
        boolean[] isprime=new boolean[n+1];
        Arrays.fill(isprime,true);
        isprime[0]=false;
        isprime[1]=false;
        for(int p=2;(long)p*p<=n;p++){
            if(isprime[p]){
                for(int i=p*p;i<=n;i+=p){
                    isprime[i]=false;
                }
            }
        }

        long sum=0;
        for(int i=2;i<=n;i++){
            if(isprime[i]){
                if(sum+i<=s){
                    sum+=i;
                    ans.add(i);
                }
                else break;
            }
        }
        return ans;
        
    }
}©leetcode
