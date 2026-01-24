
import java.util.*;

public class Main{

static class S{
    int u,mask;
    long t;
    S(int a,int b,long c){u=a;mask=b;t=c;}
}

static int minimum_freshness_threshold(int n,int m,int k,int[] g,int[][] e){
    ArrayList<int[]>[] adj=new ArrayList[n];
    for(int i=0;i<n;i++)adj[i]=new ArrayList<>();
    for(int[] x:e){
        adj[x[0]-1].add(new int[]{x[1]-1,x[2]});
    }

    long lo=0,hi=(long)1e15,ans=-1;

    while(lo<=hi){
        long mid=(lo+hi)/2;
        if(ok(n,k,g,adj,mid)){
            ans=mid;
            hi=mid-1;
        }else lo=mid+1;
    }
    return (int)ans;
}

static boolean ok(int n,int k,int[] g,ArrayList<int[]>[] adj,long X){
    int max=1<<n;
    boolean[][] vis=new boolean[n][max];
    PriorityQueue<S> pq=new PriorityQueue<>((a,b)->Long.compare(a.t,b.t));

    int startMask=1<<(g[0]-1);
    pq.add(new S(0,startMask,0));
    vis[0][startMask]=true;

    while(!pq.isEmpty()){
        S cur=pq.poll();
        if(cur.t>X)continue;

        if(cur.u==n-1){
            if(Integer.bitCount(cur.mask)>=k)return true;
        }

        for(int[] nx:adj[cur.u]){
            int v=nx[0];
            long nt=cur.t+nx[1];
            int nm=cur.mask|(1<<(g[v]-1));
            if(nt<=X && !vis[v][nm]){
                vis[v][nm]=true;
                pq.add(new S(v,nm,nt));
            }
        }
    }
    return false;
}

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
    int[] goods=new int[n];
    for(int i=0;i<n;i++)goods[i]=sc.nextInt();
    int[][] edges=new int[m][3];
    for(int i=0;i<m;i++){
        edges[i][0]=sc.nextInt();
        edges[i][1]=sc.nextInt();
        edges[i][2]=sc.nextInt();
    }
    System.out.println(minimum_freshness_threshold(n,m,k,goods,edges));
    }
}
