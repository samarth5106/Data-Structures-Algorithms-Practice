import java.util.*;

class Main{

    static class E{
        int v,w;
        E(int a,int b){v=a;w=b;}
    }

    static ArrayList<E>[] g;
    static long[] d;
    static int n;

    static long dfs(int u,int parent,int prevW){
    long sum=d[u];
    for(E e:g[u]){
        int v=e.v;
        int w=e.w;
        if(v==parent)continue;
        if(prevW!=-1 && w>=prevW)continue;
        sum+=dfs(v,u,w);
    }
    return sum;
}

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        g=new ArrayList[n];
        for(int i=0;i<n;i++)g[i]=new ArrayList<>();

        for(int i=0;i<n-1;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();
            g[u].add(new E(v,w));
            g[v].add(new E(u,w));
        }

        d=new long[n];
        for(int i=0;i<n;i++)d[i]=sc.nextLong();

       long ans=0;
for(int i=0;i<n;i++){
    ans=Math.max(ans,dfs(i,-1,-1));
}
System.out.println(ans);
    }
}
