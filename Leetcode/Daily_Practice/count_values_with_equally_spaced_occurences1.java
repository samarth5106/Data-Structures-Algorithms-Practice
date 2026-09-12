class Solution {
    public int countSpecialIntegers(int[] nums) {
        int cnt=0;
        int[] hash=new int[101];
        
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        
        for(int i=0;i<nums.length;i++){
            
            int val=nums[i];
            if(hash[val]==3){
                for(int j=i+1;j<nums.length;j++){
                
                if(nums[j]==val){
                    int space=j-i;
                    if(j+space<nums.length&&nums[j+space]==val){
                        cnt++;
                    }
                    else break;
                }
            }
            }
            
            
            
        }
        return cnt;
    }
}
