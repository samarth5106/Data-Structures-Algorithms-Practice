import java.util.*;

public class Main {
   public static int countSafeZones(char[][] grid,int n,int m){
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]=='B'){
                for(int k=j-1;k>=0;k--){
                    if(grid[i][k]=='W')break;
                    if(grid[i][k]=='0')grid[i][k]='x';
                }
                for(int k=j+1;k<m;k++){
                    if(grid[i][k]=='W')break;
                    if(grid[i][k]=='0')grid[i][k]='x';
                }
                for(int k=i-1;k>=0;k--){
                    if(grid[k][j]=='W')break;
                    if(grid[k][j]=='0')grid[k][j]='x';
                }
                for(int k=i+1;k<n;k++){
                    if(grid[k][j]=='W')break;
                    if(grid[k][j]=='0')grid[k][j]='x';
                }
            }
        }
    }

    int safe=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]=='0')safe++;
        }
    }
    return safe;
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            grid[i] = scanner.nextLine().toCharArray();
        }
        int result = countSafeZones(grid, n, m);
        System.out.println(result);
    }
}
