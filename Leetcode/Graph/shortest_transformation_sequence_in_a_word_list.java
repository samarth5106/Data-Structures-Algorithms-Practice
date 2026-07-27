class Solution {
    public ArrayList<ArrayList<String>> findSequences(String[] words, String s,
                                                      String e) {
        // code here
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        Queue<ArrayList<String>> q=new LinkedList<>();
        Set<String> st=new HashSet<>();
        for(int i=0;i<words.length;i++){
            st.add(words[i]);
        }
        ArrayList<String> used_str=new ArrayList<>();
        used_str.add(s);
        q.add(used_str);
        int level=0;
        
        int anslvl;
        while(!q.isEmpty()){
            ArrayList<String> removed=new ArrayList<>(q.remove());
            String last=removed.get(removed.size()-1);
           
            
            if(removed.size()>level){
                level++;
                for(String it:used_str){
                    st.remove(it);
                }
                used_str.clear();
            }
            if(last.equals(e)){
                if(ans.size()==0) ans.add(removed);
                else{
                    if(ans.get(0).size()==removed.size()) ans.add(removed);
                }
                
            }
            for(int i=0;i<last.length();i++){
                StringBuilder sb=new StringBuilder(last);
                for(char c='a';c<='z';c++){
                    sb.setCharAt(i,c);
                    String got=sb.toString();
                    if(got.equals(last)==false&&st.contains(sb.toString())){
                        ArrayList<String> toputin=new ArrayList<>(removed);
                        toputin.add(sb.toString());
                        used_str.add(sb.toString());
                        q.add(toputin);
                       
                    }
                }
               
            }
            
        }
        return ans;
    }
}
