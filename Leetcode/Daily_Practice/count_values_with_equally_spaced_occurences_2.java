class Solution {
    public int countSpecialIntegers(int[] nums) {
         int cnt=0;
        //int[] hash=new int[101];
        HashMap<Integer,ArrayList<Integer>> hash=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
          //  hash[nums[i]]++;
            int val=nums[i];
            if(!hash.containsKey(val)){
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(1);
                temp.add(-1);
                temp.add(i);
                temp.add(1);
                hash.put(val,temp);
            }
            else{
                ArrayList<Integer> temp=hash.get(val);
                int freq=temp.get(0);
                int space=temp.get(1);
                int last=temp.get(2);
                int valid=temp.get(3);
                int curr=i-last;
                freq++;
                if(freq==2){
                    space=curr;
                }
                else if(curr!=space){
                    valid=0;
                }
                temp.set(0,freq);
                temp.set(1,space);
                temp.set(2,i);
                temp.set(3,valid);
            }
         //   hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        }
         
        for(ArrayList<Integer> temp:hash.values()){
            if(temp.get(0)>=3&&temp.get(3)==1) cnt++;
            //int  val=nums[i];
            
        }
        return cnt;
    }
}
