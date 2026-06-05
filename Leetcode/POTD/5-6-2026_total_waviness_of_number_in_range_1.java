class Solution {
    public int totalWaviness(int num1, int num2){
        int ans=0;
        for(int i=num1;i<=num2;i++)ans+=check(i);
        return ans;
    }
    int check(int n){
        if(n<100)return 0;
        int count=0;
        String str=n+"";
        for(int i=1;i<str.length()-1;i++){
            int curr=str.charAt(i)-'0';
            int left=str.charAt(i-1)-'0';
            int right=str.charAt(i+1)-'0';
            if(curr>left&&curr>right)count++;
            if(curr<left&&curr<right)count++;
        }return count;
    }
}
