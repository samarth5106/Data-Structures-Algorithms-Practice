class Solution {

    void traversal(int node, int[] visi,int[][] isConnected){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        visi[node]=1;
        while(!q.isEmpty()){
            int nd=q.poll();
            //nd ke neghbr in q and mark them
            for(int i=0;i<isConnected[nd].length;i++){
                if(isConnected[nd][i]==1&&visi[i]==0){
                    q.add(i);
                    visi[i]=1;
                    //vstd[i]=1;
                }
            }
        }
    
    }
    public int findCircleNum(int[][] isConnected) {
        int[] visi=new int[isConnected.length];
        //0 based nodes 0 to n-1
        //node i means i+1th node
        int cnt=0;
        for(int i=0;i<isConnected.length;i++){
            if(visi[i]==0){
                traversal(i,visi,isConnected);
                cnt++;
            }
        }
        return cnt;
    }
}
