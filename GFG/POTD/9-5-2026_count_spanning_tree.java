class Solution {
    
    public static int getDeterminant(int[][] matrix) {
    int n = matrix.length;
    if (n == 1) return matrix[0][0]; // Base case
    if (n == 2) return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);

    int det = 0;
    for (int i = 0; i < n; i++) {
        int[][] subMatrix = createSubMatrix(matrix, 0, i);
        det += Math.pow(-1, i) * matrix[0][i] * getDeterminant(subMatrix);
    }
    return det;
}

// Helper to remove row 0 and column 'col'
private static int[][] createSubMatrix(int[][] matrix, int row, int col) {
    int n = matrix.length;
    int[][] sub = new int[n - 1][n - 1];
    int r = -1;
    for (int i = 0; i < n; i++) {
        if (i == row) continue;
        r++;
        int c = -1;
        for (int j = 0; j < n; j++) {
            if (j == col) continue;
            sub[r][++c] = matrix[i][j];
        }
    }
    return sub;
}
    public int countSpanTree(int n, int[][] edge) {
        // code here
        // nodes from 0 to n-1=[0,n-1]
        
        if(n==1) return 1;
        if(edge.length==n-1) return 1;
        int[][] degree=new int[n][n];
        int node=0;
        
        while(node!=n){
           int cnt=0;
            for(int i=0;i<edge.length;i++){
              if(edge[i][0]==node||edge[i][1]==node){
                  cnt++;
              }
            }
            degree[node][node]=cnt;
            node++;
        }
        //degree marix done
        
        int[][] adjacency=new int[n][n];
        node=0;
        while(node!=n){
            for(int i=0;i<edge.length;i++){
                if(edge[i][0]==node){
                    adjacency[node][edge[i][1]]=1;
                    //adjacency[edge[i][1]][node]=1;
                }
                 if(edge[i][1]==node){
                    adjacency[node][edge[i][0]]=1;
                    //adjacency[edge[i][0]][node]=1;
                }
            }
            node++;
        }
        //adjacency matrix done
        
        int[][] laplacian=new int[n-1][n-1];
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                laplacian[i][j]=degree[i][j]-adjacency[i][j];
            }
        }
        
        //delete one row and same column
        // let it be n-1th row and n-1th column
        // now laplacian is from (n-1)*n-1
        
        //done already
        
        //determinant
        int ansOOHMAAGAAD=getDeterminant(laplacian);
        return ansOOHMAAGAAD;
        
    }
}



Approach - see approach used is Kirchoff's Theorem and there is something called as Laplacian matrix

1) make degree matrix(a diagonal matrix ,, the diagonal elements are the degree of nodes )
2) make the adjacency matrix 
3) now do Laplacian matrix = degree matrix - adjacency matrix
4) delete any ith row and sae=me ith column
5) determinant of remainning laplacian matrix is the number of Spanning Tree

Edge case - if node is single then number of spanning tree =1
if number of total edges ==n-1 then answer 1

