class Solution {
List<List<String>> ans=new ArrayList<>();
    void solve(int i,String s,List<String> toin){
        
        if(i==s.length()){
           ans.add(new ArrayList<>(toin));
            return;
        }
        for(int ind=i;ind<s.length();ind++){
            String check=s.substring(i,ind+1);
            String pal=new StringBuilder(check).reverse().toString();
            if(pal.equals(check)){
                toin.add(check);
                solve(ind+1,s,toin);
                toin.remove(toin.size()-1);
            }
           
        }
    }

    public List<List<String>> partition(String s) {
        
       List<String> toin=new ArrayList<>();
    solve(0,s,toin);
    return ans;
}
}
