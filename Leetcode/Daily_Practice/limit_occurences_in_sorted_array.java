class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
       
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int cnt=1;
            int val=nums[i];
            al.add(val);
            int j=i+1;
            
            while(j<nums.length&&nums[j]==val&&cnt<k){
                al.add(val);
                 cnt++;
                j++;
            }
            while(j<nums.length&&nums[j]==val){
                
                j++;
            }
            
            i=j-1;
        }
         int[] ans=new int[al.size()];
        for(int i=0;i<al.size();i++){
            ans[i]=al.get(i);
        }
        return ans;
        
    }
}©leetcode
