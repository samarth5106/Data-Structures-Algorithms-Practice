class Solution {
    int solve(Node nd){

    if(nd==null) return 0;

    int leftsum=solve(nd.left);

    int rightsum=solve(nd.right);

    int oldval=nd.data;

    nd.data=leftsum+rightsum;

    return oldval+leftsum+rightsum;
}
    public void toSumTree(Node root) {
        // code here
        solve(root);
        
    }
}
