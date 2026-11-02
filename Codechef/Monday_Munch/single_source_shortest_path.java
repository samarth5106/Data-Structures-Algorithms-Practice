import java.util.*;


public class Main
{
    
    static class Edge{
        int u,v;
        long wt;
        Edge(int u,int v,long wt){
            this.u=u;
            this.v=v;
            this.wt=wt;
        }
    }
    
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       if(!sc.hasNextInt()) return;
       int n=sc.nextInt();
       int m=sc.nextInt();
         Edge[] edges=new Edge[m];
         for(int i=0;i<m;i++){
             edges[i]=new Edge(sc.nextInt(),sc.nextInt(),sc.nextLong());
         }
         long INF=Long.MAX_VALUE;
         long[] dist=new long[n+1];
         Arrays.fill(dist,INF);
         
         dist[1]=0;
         for(int i=1;i<=n-1;i++){
             boolean updated=false;
             for(Edge e:edges){
                 if(dist[e.u]!=INF&&dist[e.u]+e.wt<dist[e.v]){
                     dist[e.v]=dist[e.u]+e.wt;
                 }
             }
         }
        
        
             for(int i=1;i<=n;i++){
                 System.out.print(dist[i]+(i==n?"":" "));
             }
             System.out.println();
         
         
         
          
       
       

    }
}
