class Solution {
    public int longestSubsequence(int[] nums) {
        //0^1=1
        //0^0 1^1=0.. even numbr of 0 or 1 ak xor=0
//odd number of odd and 1 even

//odd even and eddd odd- 
//even nmbr odd ho ya even its xor is 0

// even/odd evens and odd odd = non zero xor
// even/odd evens and even odds=xor will be 0

//if all even/odd same even time then 0 but if odd imes then 1;
//if(nums.length==1) return 1;
int xr=0;
int sum=0;
for(int i=0;i<nums.length;i++){
   xr^=nums[i];
   sum+=nums[i];
}
if(xr!=0) return nums.length;
return sum==0? 0:nums.length-1;


    }
}
