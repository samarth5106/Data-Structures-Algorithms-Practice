import java.util.*;
class Solution {
    int lowerBound(ArrayList<Integer>list,int l) {
    int strt=0,end=list.size();
    while (strt<end) {
        int mid=(strt+end)/2;
        if (list.get(mid)<l)
            strt=mid+1;
            else 
            end=mid;
    }
    return strt;
}
int upperBound(ArrayList<Integer>list,int r) {
    int strt=0, end=list.size();
    while (strt<end){
        int mid=(strt+end)/2;
        if (list.get(mid)<=r)
            strt=mid+1;
        else 
            end=mid;
    }
    return strt;
}


    public ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {
        // code here
        Map<Integer, ArrayList<Integer>> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
         int val=arr[i];

    if (!mp.containsKey(val)) {
        mp.put(val, new ArrayList<>());
    }
    
    mp.get(val).add(i);   
        }
        int l=0,r=0;
        int times=0;
ArrayList<Integer> ans=new ArrayList<>();
        int tosearch=0;
        
        for(int i=0;i<queries.length;i++){
            
            times=0;
            tosearch=queries[i][2];
             if(!mp.containsKey(tosearch))
                {
                    ans.add(0);continue;
                }
            l=queries[i][0];
            r=queries[i][1];
            
            int begn=lowerBound(mp.get(tosearch),l);
            int smpt=upperBound(mp.get(tosearch),r);
            times=smpt-begn;
                ans.add(times);
            
                
           
            }
            
            
             return ans;
        }
       
    }
