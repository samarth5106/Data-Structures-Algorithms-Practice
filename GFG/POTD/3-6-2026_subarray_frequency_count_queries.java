class Solution {
    
    int BS(int l,ArrayList<Integer> al){
        int low=0;
        int h=al.size()-1;
        int idx=-1;
        while(low<=h){
            int mid=(low+h)/2;
            if(al.get(mid)>=l){
                idx=mid;
                h=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return idx;
    }
    
    int BSr(int r,ArrayList<Integer> al){
        int low=0;
        int h=al.size()-1;
        int idx=-1;
        while(low<=h){
            int mid=(low+h)/2;
            if(al.get(mid)<=r){
                idx=mid;
                low=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return idx;
    }
    
    public ArrayList<Integer> freqInRange(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        
        HashMap<Integer,ArrayList<Integer>> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],new ArrayList<>());
                mp.get(arr[i]).add(i);
            }
                
                
            else{
                mp.get(arr[i]).add(i);
                
            }
            
        }
        for(int i=0;i<queries.length;i++){
            int cnt=0;
            int l=queries[i][0];
            int r=queries[i][1];
            int x=queries[i][2];
           //tofind 1st one with >=l and last one with <=r
           int start=-1;
           if(mp.get(x)!=null)
            start=BS(l,mp.get(x));
            
            int end=-1;
            if(mp.get(x)!=null){
                end=BSr(r,mp.get(x));
            }
            //end-start+1
            if(end!=-1&&start!=-1){
                ans.add(end-start+1);
            }
            else{
                ans.add(0);
            }
            
        }
        return ans;
        
        
        
    }
}
