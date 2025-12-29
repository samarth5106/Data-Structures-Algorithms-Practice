import java.util.*;

class Solution{
    Map<String,List<Character>> mp=new HashMap<>();

    public boolean pyramidTransition(String bottom,List<String> allowed){
        for(String s:allowed){
            String key=s.substring(0,2);
            mp.computeIfAbsent(key,k->new ArrayList<>()).add(s.charAt(2));
        }
        return dfs(bottom);
    }

    boolean dfs(String row){
        if(row.length()==1) return true;

        List<String> nextRows=new ArrayList<>();
        build(row,0,new StringBuilder(),nextRows);

        for(String nxt:nextRows){
            if(dfs(nxt)) return true;
        }
        return false;
    }

    void build(String row,int idx,StringBuilder sb,List<String> res){
        if(idx==row.length()-1){
            res.add(sb.toString());
            return;
        }

        String key=row.substring(idx,idx+2);
        if(!mp.containsKey(key)) return;

        for(char c:mp.get(key)){
            sb.append(c);
            build(row,idx+1,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
