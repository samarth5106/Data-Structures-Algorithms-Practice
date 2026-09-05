class tuple{
   // pair pr;
    int r;
    int c;
    int level;
    tuple(int r,int c,int l){
        this.r=r;
        this.c=c;
        level=l;
    }

}

class Solution {

    public int nearestExit(char[][] maze, int[] entrance) {
        //up down let right
        Queue<tuple> q=new LinkedList<>();
        q.add(new tuple(entrance[0],entrance[1],0));
        int[][] visited=new int[maze.length][maze[0].length];
        visited[entrance[0]][entrance[1]]=1;

        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};

        while(!q.isEmpty()){

            tuple tp=q.remove();
            int level=tp.level;
            if((tp.r==0||tp.r==maze.length-1||tp.c==0||tp.c==maze[0].length-1)&&level!=0){
               
                return level;
            }
            for(int i=0;i<4;i++){
                int nr=dr[i]+tp.r;
                int nc=dc[i]+tp.c;
                if(nr>=0&&nr<maze.length&&nc>=0&&nc<maze[0].length){
                    if(visited[nr][nc]==0&&maze[nr][nc]=='.'){
                        visited[nr][nc]=1;
                        q.add(new tuple(nr,nc,level+1));
                    }
                }
            }
        

        }
        return -1;

    }
}
