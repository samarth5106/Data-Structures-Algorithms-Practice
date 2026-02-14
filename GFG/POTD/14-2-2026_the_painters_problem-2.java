class Solution {
    static boolean canpaint(int[] arr,int k, int mid){
        int painters=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>mid){
                painters++;
                sum=arr[i];
                if(painters>k)
                return false;
            }
                else sum+=arr[i];
            
        }
        return true;
    }
    public int minTime(int[] arr, int k) {
        // code here
        int low=0,high=0;
        int i=0;
        while(i<arr.length){
            low=Math.max(arr[i],low);
            high+=arr[i];
            i++;
            }
             int mid=low;
            while(low<=high){
                 mid=low+(high-low)/2;
                //mid=mid/2;
                if(canpaint(arr,k,mid)){
                    high=mid-1;
                    
                }
                else{
                    low=mid+1;
                }
            }
            return low;
    }
}


Logic - Binary search + Greedy 

see minimum time jo lag sakta hai is the max(arr) means when the numbers of painters (k) would be equal to the size of array then each painter will paint one board,,, and the maximum answer possible will be the sum of all elements means when only one painter is there (k=1),, so low = max(arr) and high=sum(arr),, issme BS lagao to find the minimum possible time req to paint all the boards , so  apan ne mid nikala then GREEDILY check that ye mid ko complete karne me kitne painters lagenge if painters required will be greater than k then low=mid+1,, else it will mean ki ho sakta ho mid ki value aur ki jaa sakti hai so then high=mid-1 krenge 

Greedy - we got value of mid ,, so now ek painter ko assign karo boards (elements of array) as much as possible till its sum is less than mid ,, and when limit is reched then we will increase painters(count of number of painters) by 1 and check whether this count is less than k or not ,, if not then return false
