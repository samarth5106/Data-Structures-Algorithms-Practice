import java.util.*;

class Solution {
    TreeMap<Integer,Integer> map=new TreeMap<>();
    
    void solve(Node root,int col){
        if(root==null)return;
        map.put(col,map.getOrDefault(col,0)+root.data);
        solve(root.left,col-1);
        solve(root.right,col+1);
    }
    
    public ArrayList<Integer> verticalSum(Node root) {
        map.clear();
        solve(root,0);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int sum:map.values()){
            ans.add(sum);
        }
        return ans;
    }
}
