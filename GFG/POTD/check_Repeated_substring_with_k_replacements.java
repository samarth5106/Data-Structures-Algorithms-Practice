class Solution {
    public boolean kSubstr(String s, int k) {
        // code here
        int l=0;
        int r=l+k;
        String sub="";
        HashMap<String,Integer> mp=new HashMap<>();
        while(r<=s.length()){
            sub=s.substring(l,r);
              mp.put(sub,mp.getOrDefault(sub,0)+1);
              l+=k;
              r+=k;
        }
        int cnt=0;
        for(Map.Entry<String,Integer> entry:mp.entrySet()){
         
                int val=entry.getValue();
                
                if(val==1) cnt++;
            
        }
        if(mp.size()==1||cnt==1||(cnt==2&&mp.size()==2))return true;
        return false;
    }
}
