/* Binary Tree Node Structure
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class pair{
    
    int level;
    Node node;
    
    pair(Node node,int level){
        this.node=node;
        this.level=level;
    }
    
}

class Solution {
    public int getCount(Node root, int k) {
        // code here
          // code here
        //hr ek leaf node ka level nikal lo
        // then sort in asc then prefix sum >k hone ke phle tak ke lelo
        
        //bfs, without maintaining visited , 
        //ArrayList<Integer> level=new ArrayList<>();
        Queue<pair> q=new LinkedList<>();
        //traverse and make this adj list
       // ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        
        q.add(new pair(root,1));
        int cnt=0;
       // int sum=0;
        while(!q.isEmpty()){
            
            pair pr=q.remove();
            Node nd=pr.node;
            Node left=nd.left;
            Node right=nd.right;
            int level=pr.level;
            
            if(left==null&&right==null){
                if(k>=level){
                    k-=level;
                    cnt++;
                }
                else break;
            }
            if(left!=null){
                q.add(new pair(left,level+1));
            }
            if(right!=null){
                q.add(new pair(right,level+1));
            }
            
        }
        return cnt;
    }
}
