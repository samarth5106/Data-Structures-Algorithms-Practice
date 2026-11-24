class Solution {
//     int BS(int val,int l,int h,int[] dup){
//     while(l<=h){
//         int mid=l+(h-l)/2;
//         if(dup[mid]>=val){
//             l=mid+1;
//         }else{
//             h=mid-1;
//         }
//     }
//     return l;
// }
    //private boolean check(int i,int[] duplicate,int[] nums,int[] target){
       
        
        //nums[i] ke lie duplicae mei index dhundhna hai
        // int val=nums[i];
        // int idx=BS(val,i+1,nums.length-1,duplicate);
        // for(int k=i;k<idx-1;k++){
        //     duplicate[k]=duplicate[k+1];
        // }
        // duplicate[idx-1]=val;

        // Arrays.sort(duplicate,i,nums.length);
        // int left=i;
        // int right=nums.length-1;
        // while(left<right){
        //     int temp=duplicate[left];
        //     duplicate[left]=duplicate[right];
        //     duplicate[right]=temp;
        //     left++;
        //     right--;
        // }
       // return Arrays.equals(duplicate,target);
    //}
    public int countSuffix(int[] nums, int[] target) {
        int i=0;
          while(i<nums.length&&nums[i]==target[i]){
            i++;
        }
        if(i==nums.length)
            i--;
        
        int cnt=0;
        int duplicate[]=nums.clone();
        Arrays.sort(duplicate,i,nums.length);
        int left=i;
        int right=nums.length-1;
        while(left<right){
            int temp=duplicate[left];
            duplicate[left]=duplicate[right];
            duplicate[right]=temp;
            left++;
            right--;
        }
       boolean initial=false;
        if(Arrays.equals(duplicate,target)){
            cnt++;
            initial=true;
        }
        i--; 
        int front=duplicate[i+1];
        while(i>=0){
            int curr=duplicate[i];
            if(curr>=front){
                if(initial) cnt++;
                front=curr;
            }
            else break;
            i--;
        }
        return cnt;

    }
}
