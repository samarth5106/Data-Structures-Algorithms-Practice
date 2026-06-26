class Solution {
    int traversal(int node,ArrayList<ArrayList<Integer>> adj,int n){
        int cnt=0;
        Queue<Integer> q=new LinkedList<>();
        int[] visi=new int[n];
        q.add(node);
        cnt++;
        visi[node]=1;
        while(!q.isEmpty()){
            int nd=q.poll();
            //nd ke nghbrs add in q and mark thm
            for(int i=0;i<adj.get(nd).size();i++){
                if(visi[adj.get(nd).get(i)]==0){
                    visi[adj.get(nd).get(i)]=1;
                    cnt++;
                    q.add(adj.get(nd).get(i));
                }
            }
        }
        return cnt;
        
    }
    public int maximumDetonation(int[][] bombs) {
        //if bombxth ka (x,y) dist from bombyth <=bombyth ka range ..Boom
       // int cnt=0;
        //if within range then directed edge from that bomb to otherbmb
        //n==bombs.length
        //adj list
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<bombs.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<bombs.length;i++){
            int x1=bombs[i][0];
            int y1=bombs[i][1];
            int r=bombs[i][2];
            for(int j=0;j<bombs.length;j++){
                if(j==i) continue;
                int x2=bombs[j][0];
                int y2=bombs[j][1];
                int dx=x2-x1;
                int dy=y2-y1;
                double dist=Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
                if(dist<=r){
                    adj.get(i).add(j);
                }
                
            }
        }
        int n=bombs.length;
         
        int maxi=0;
        int cnt=0;
        for(int i=0;i<n;i++){
             //int[] visi=new int[n];
               cnt= traversal(i,adj,n);
            maxi=Math.max(maxi,cnt);
        }
        return maxi;
    }
}
