import java.util.*;

public class Main {
    static class Node {
        int x,y,step;
        Node(int a,int b,int c){
            x=a;y=b;step=c;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int K=sc.nextInt();

        char[][] g=new char[N][M];
        for(int i=0;i<N;i++){
            g[i]=sc.next().toCharArray();
        }

        int sx=sc.nextInt()-1;
        int sy=sc.nextInt()-1;
        int tx=sc.nextInt()-1;
        int ty=sc.nextInt()-1;

        int[][] block=new int[N][M];
        boolean[][] vis=new boolean[N][M];

        Queue<Node> q=new ArrayDeque<>();
        q.add(new Node(sx,sy,0));
        vis[sx][sy]=true;

        int[] dx={1,-1,0,0};
        int[] dy={0,0,1,-1};

        while(!q.isEmpty()){
            Node cur=q.poll();
            int x=cur.x,y=cur.y,d=cur.step;

            if(x==tx&&y==ty){
                System.out.println(d);
                return;
            }

            for(int i=0;i<4;i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
                if(nx<0||ny<0||nx>=N||ny>=M)continue;
                if(g[nx][ny]=='T')continue;
                if(block[nx][ny]>d)continue;
                if(vis[nx][ny])continue;

                vis[nx][ny]=true;

                if(g[nx][ny]=='E'){
                    for(int j=0;j<4;j++){
                        int bx=nx+dx[j];
                        int by=ny+dy[j];
                        if(bx>=0&&by>=0&&bx<N&&by<M&&g[bx][by]=='.'){
                            block[bx][by]=Math.max(block[bx][by],d+K+1);
                        }
                    }
                }

                q.add(new Node(nx,ny,d+1));
            }
        }

        System.out.println(-1);
    }
}

