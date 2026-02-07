class Solution{
    static int maxSum(int arr[],int n){
        long totsum=0;
        long cur=0;
        for(int i=0;i<n;i++){
            totsum+=arr[i];
            cur+=1L*i*arr[i];
        }
        long ans=cur;
        for(int i=1;i<n;i++){
            cur=cur+totsum-1L*n*arr[n-i];
            if(cur>ans)ans=cur;
        }
        return (int)ans;
    }
}
