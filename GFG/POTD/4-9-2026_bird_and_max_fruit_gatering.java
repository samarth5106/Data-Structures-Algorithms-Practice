class Solution {
     public int maxFruits(ArrayList<Integer> arr, int m) {
         // code here
         int l=0;
         int r=m-1;
         int sum =0;

         for(int i=0;i<=r;i++){
             sum+=arr.get(i);
         }

         r++;
         if(r==arr.size()) return sum;

         int maxi=sum;

         while(l<arr.size()){
             sum+=arr.get(r);
             sum-=arr.get(l);
             maxi=Math.max(sum,maxi);
             l++;
             r++;
             if(r==arr.size()){
                 r=0;
             }
         }
         return maxi;
     }
 }
