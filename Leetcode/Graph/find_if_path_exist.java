class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        if(source==destination) return true;

        int[] parent=new int[n];
        int[] rank=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        for(int[] edge:edges){
            union(edge[0],edge[1],parent,rank);
        }

        return find(source,parent)==find(destination,parent);


    }


    private int find(int node,int[] parent){
        if(parent[node]!=node){
            parent[node]=find(parent[node],parent);
        }
        return parent[node];
    }


    private void union(int u,int v,int[] parent,int[] rank){
        int rootU=find(u,parent);
        int rootV=find(v,parent);
        if(rootU!=rootV){
            if(rank[rootU]<rank[rootV]){
                parent[rootU]=rootV;
            }
            else if(rank[rootU]>rank[rootV]){
                parent[rootV]=rootU;
            }
            else{
                parent[rootV]=rootU;
                rank[rootU]++;
            }
        }


    }
}
