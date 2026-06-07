import java.util.*;

class Solution {
    public TreeNode createBinaryTree(int[][] de) {
        HashMap<Integer,TreeNode> mp=new HashMap<>();
        HashSet<Integer> isChild=new HashSet<>();
        
        for(int i=0;i<de.length;i++){
            int p=de[i][0];
            int c=de[i][1];
            int isLeft=de[i][2];
            
            if(!mp.containsKey(p)){
                mp.put(p,new TreeNode(p));
            }
            if(!mp.containsKey(c)){
                mp.put(c,new TreeNode(c));
            }

            TreeNode parentNode=mp.get(p);
            TreeNode childNode=mp.get(c);
            
            if(isLeft==1){
                parentNode.left=childNode;
            }else{
                parentNode.right=childNode;
            }
            
            isChild.add(c);
        }
        
        for(int i=0;i<de.length;i++){
            int currentParent=de[i][0];
            if(!isChild.contains(currentParent)){
                return mp.get(currentParent);
            }
        }
        
        return null;
    }
}
