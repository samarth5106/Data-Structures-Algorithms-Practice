class Solution {
    public int maxValidSplits(int[] nums) {
        int  n=nums.length;
        int maxi=splits(nums);
        
        for(int k=0;k<n;k++){
            int arr[]=new int[n-1];
            int idx=0;
            for(int i=0;i<n;i++){
                if(i==k) continue;
                arr[idx++]=nums[i];
            }
            maxi=Math.max(maxi,splits(arr));
        }
        return maxi;
    }
    private int splits(int[] arr){
        int m=arr.length;
        if(m<2) return 0;
        int[] prefgcd=new int[m];
        int[] suffgcd=new int[m];
        prefgcd[0]=arr[0];
        for(int i=1;i<m;i++){
            prefgcd[i]=gcd(prefgcd[i-1],arr[i]);
        }
        suffgcd[m-1]=arr[m-1];
        for(int i=m-2;i>=0;i--){
            suffgcd[i]=gcd(suffgcd[i+1],arr[i]);
        }
        int cnt=0;
        for(int i=0;i<m-1;i++){
            if(prefgcd[i]==suffgcd[i+1]) cnt++;
        }
        return cnt;
        
    }
    private int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
