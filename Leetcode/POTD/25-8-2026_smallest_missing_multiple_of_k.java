class Solution {
    public int missingMultiple(int[] nums, int k) {
        int val=1;
        boolean gotit=false;
        int find=0;

        while(true){

             find=k*val;
            gotit=false;
            
            for(int i=0;i<nums.length;i++){
                if(nums[i]==find){
                    gotit=true;break;
                }
            }

            val++;
            if(!gotit) break;
        }
        return find;
        

    }
}
