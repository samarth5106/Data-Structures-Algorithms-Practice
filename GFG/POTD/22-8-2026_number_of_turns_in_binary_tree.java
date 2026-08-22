/* Structure of Binary Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    
    boolean findpath(Node root, int target,ArrayList<Node> path){
        if(root==null) return false;
        path.add(root);
        
        if(root.data==target) return true;
        if(findpath(root.left,target,path)) return true;
        if(findpath(root.right,target,path)) return true;
         path.remove(path.size() - 1);
        
        return false;
    }
    
    public int numberOfTurns(Node root, int p, int q) {
        // code here
        if(root==null) return -1;
        
        ArrayList<Node> pathp=new ArrayList<>();
       // 1,2,5
        
        ArrayList<Node> pathq=new ArrayList<>();
        
        
        findpath(root,p,pathp);
        findpath(root,q,pathq);
        
        int prev=0;
        int curr=0;
        int turns=0;
        int i=0;
        
        while(i<pathp.size()&&i<pathq.size()&&pathp.get(i)==pathq.get(i)){
            i++;
        }
        //i-1 is root r LCA
        // for p fstrt form p move towards lca
        for(int j=pathp.size()-1;j>=i;j--){
           
            //i am going from child towards parent
            Node child=pathp.get(j);//5
            Node parent=pathp.get(j-1);//2
            
            if(parent.left!=null&&parent.left==child){
                curr=1;
            }
            else if(parent.right!=null&&parent.right==child){
                curr=2;
            }
            
            if(prev!=0&&prev!=curr) turns++;
            
            prev=curr;
        }
        
        //for q move from lca to towards q
        //1,3,6,10 prev=1
        for(int j=i-1;j<pathq.size()-1;j++){
            //moving from parent to towards child
            Node parent=pathq.get(j);
            Node child=pathq.get(j+1);
            
            if(parent.left!=null&&parent.left==child){
                curr=1;
            }
            else if(parent.right!=null&&parent.right==child){
                curr=2;
            }
            if(prev!=0&&prev!=curr) turns++;
            prev=curr;
        }
        
        if(turns==0) return -1;
        return turns;
        
    }
}
