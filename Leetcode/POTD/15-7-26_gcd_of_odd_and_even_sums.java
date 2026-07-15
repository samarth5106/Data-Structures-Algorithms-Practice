class Solution {

    int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int sumnodd=0;
        int sumeven=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==1) sumnodd+=i;
            else{
                sumeven+=i;
            }
        }
        return gcd(sumnodd,sumeven);
    }
}
