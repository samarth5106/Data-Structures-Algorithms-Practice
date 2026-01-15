class Solution {
  public:
    int minCandy(vector<int> &arr) {
        int ans=0;
        int sz=arr.size();
        if(sz==1)return 1;

        int i=0;
        while(i<sz){
            int up=0;
            int down=0;

            while(i+1<sz&&arr[i]==arr[i+1]){
                ans++;
                i++;
            }

            while(i+1<sz&&arr[i]<arr[i+1]){
                up++;
                i++;
            }

            while(i+1<sz&&arr[i]>arr[i+1]){
                down++;
                i++;
            }

            if(up>0||down>0){
                ans+=up*(up+1)/2;
                ans+=down*(down+1)/2;
                ans+=max(up,down);
            }
            else{
                ans++;
                i++;
            }
        }
        return ans;
    }
};
