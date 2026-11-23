//import java.util.*;
import java.util.*;
import java.io.*;
public class Main
{
    static int timer;
    static int[] tin,low;
    static boolean[] vis;
    static int ans;

    static void dfs(int curr,int parent,ArrayList<ArrayList<Integer>> adj)
    {
        vis[curr]=true;
        tin[curr]=low[curr]=timer++;

        for(int nbr:adj.get(curr))
        {
            if(nbr==parent) continue;

            if(!vis[nbr])
            {
                dfs(nbr,curr,adj);

                low[curr]=Math.min(low[curr],low[nbr]);

                if(low[nbr]>tin[curr])
                    ans++;
                
            }
            else
            {
                low[curr]=Math.min(low[curr],tin[nbr]);
            }
        }
    }

    public static void main(String[] args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int t;
        t=Integer.parseInt(br.readLine().trim());

        while(t-->0)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n;
            n=Integer.parseInt(st.nextToken());
            int m;
            m=Integer.parseInt(st.nextToken());
            ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

            for(int i=0;i<=n;i++)
            { adj.add(new ArrayList<>());
            }

            for(int i=0;i<m;i++)
            { st=new StringTokenizer(br.readLine());
                int a;
                a=Integer.parseInt(st.nextToken());
                int b;
                b=Integer.parseInt(st.nextToken());
                adj.get(a).add(b);
                adj.get(b).add(a);
            }
            
            ans=0;
            timer=0;
            tin=new int[n+1];
            low=new int[n+1];
            vis=new boolean[n+1];

            dfs(1,-1,adj);

            System.out.println(ans);
        }
    }
}
