class Solution {
    public int maxEqualSum(ArrayList<Integer> s1, ArrayList<Integer> s2,
                           ArrayList<Integer> s3) {
        // code here
                //int n=Math.max(s1.size(),Math.max(s2.size(),s3.size()));
        int[] suf1=new int[s1.size()];
        int[] suf2=new int[s2.size()];
        int[] suf3=new int[s3.size()];
        int sum=0;
        

        
        for(int i=0;i<s1.size();i++){
            
            sum+=s1.get(s1.size()-1-i);
            
            suf1[i]=sum;
        }
        
        sum=0;
        for(int i=0;i<s2.size();i++){
           
            sum+=s2.get(s2.size()-1-i);
            suf2[i]=sum;
        }
        
         sum=0;
        for(int i=0;i<s3.size();i++){
           
            sum+=s3.get(s3.size()-1-i);
            suf3[i]=sum;
        }
        
        //int i=0;
        int ans=0;
        // while(i<n){
        //     if(suf1[i]==suf2[i]&&suf2[i]==suf3[i]){
        //         ans=Math.max(ans,suf1[i]);
        //     }
        //     i++;
        // }
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<s1.size();i++){
            mp.put(suf1[i],mp.getOrDefault(suf1[i],0)+1);
        }
        for(int i=0;i<s2.size();i++){
            mp.put(suf2[i],mp.getOrDefault(suf2[i],0)+1);
        }
        for(int i=0;i<s3.size();i++){
            mp.put(suf3[i],mp.getOrDefault(suf3[i],0)+1);
            if(mp.get(suf3[i])==3){
                ans=Math.max(ans,suf3[i]);
            }
        }
        
        return ans;
    }
}
