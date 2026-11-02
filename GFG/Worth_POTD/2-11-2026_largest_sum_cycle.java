class Solution {
    int dfs(int node,int[] visited,int[] edge){
        
        if(node==-1||visited[node]==2) return -1;
        
        if(visited[node]==1){
            return node;
        }
       // if() 
        
        visited[node]=1;
        int start=dfs(edge[node],visited,edge);
         
        
       return start;
        
    }
    
    int findcost(int start,int[] edge,int[] visited){
        int sum=0;
        while(visited[start]!=2){
            sum+=start;
            visited[start]=2;
            start=edge[start];
            
        }
        return sum;
    }
    public int largestSumCycle(int[] edge) {
        // code here
        // 0 to n-1 node
        // outgoing directed edge
    
      int n=edge.length;

        //dfs
        int[] visited=new int[edge.length];
        int maxi=-1;
        
        for(int i=0;i<n;i++){
            if(edge[i]==-1){
                visited[i]=2;continue;
            }
            if(visited[i]==0){
                int start=dfs(i,visited,edge);
                
                if(start>=0){
                    int cost=findcost(start,edge,visited);
                    maxi=Math.max(maxi,cost);
                    
                }
                
                
                for(int j=0;j<n;j++){
                    if(visited[j]==1) visited[j]=2;
                }
            }
            
            
        }
        
        return maxi;

        
    }
}
