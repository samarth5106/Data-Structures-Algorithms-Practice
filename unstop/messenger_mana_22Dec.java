import java.util.*;
import java.io.*;

public class Main {
    static class Cell{
        int X,Y;
        Cell(int q,int r){
            X=q;Y=r;
        }
    }
    public static int minMana(char[][] grid) {
        int row=grid.length;
        int colmn=grid[0].length;
        int [][] dist=new int[row][colmn];
        for(int [] evry: dist){
            Arrays.fill(evry,Integer.MAX_VALUE);
        }
    int answer=0;
        Deque<Cell> dq=new ArrayDeque<>();
        dq.addFirst(new Cell(0,0));
        dist[0][0]=0;
        int [] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};
        char[] dir={'a','b','c','d'};
        while(!dq.isEmpty()){
            Cell curnt=dq.pollFirst();
            int x=curnt.X;
            int y=curnt.Y;
            for(int i=0;i<4;i++){
                int nonax=x+dx[i];
                int nonay=y+dy[i];
                if(nonax<0||nonay<0||nonax>=row||nonay>=colmn){
                    continue;
                }
                if(grid[x][y]==dir[i]){
                         answer=0;
                }
                   
                    else {
                    answer=1;
                    }
                        
                if(dist[x][y]+answer<dist[nonax][nonay]){
                    dist[nonax][nonay]=dist[x][y]+answer;
                
                if(answer==0){
                    dq.addFirst(new Cell(nonax,nonay));

                }
                else {
                    dq.addLast(new Cell(nonax,nonay));}
                }
            }
        }
        // Write your logic here.
        return dist[row-1][colmn-1];
    }
    
    public static void main(String[] args)  throws Exception{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String line = br.readLine();   
    String[] first = line.trim().split("\\s+");
        int m = Integer.parseInt(first[0]);
        int n = Integer.parseInt(first[1]);
        
        char[][] grid = new char[m][n];
        
           for (int j = 0; j < m; j++) {
    grid[i][j] = parts[j].charAt(0);
}
        
        
        int result = minMana(grid);
        System.out.println(result);
    }
}
