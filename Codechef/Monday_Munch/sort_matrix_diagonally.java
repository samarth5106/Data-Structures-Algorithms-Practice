import java.util.*;


public class Main
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
      
       
          int n;
          n=sc.nextInt();
          int m;
          m=sc.nextInt();
          int[][] mat=new int[n][m];
          for(int i=0;i<n;i++){
              for(int j=0;j<m;j++){
                  mat[i][j]=sc.nextInt();
              }
          }
          
          //just sort each diagonal
          //0th column 0th row
          //n-1th column and n-1th row cell = no need of sort
          //move frm 0th col n-2th row to m-2th col 0th row
          
          //number of elmnt in each diagonal?
          int[][] ans=new int[n][m];
       
          
          for(int r=n-1;r>=0;r--){
              int v=0;
            ArrayList<Integer> al=new ArrayList<>();
            int diagr=r;
            int diagc=0;
            while(diagr<n&&diagc<m){
                al.add(mat[diagr][diagc]);
                diagr++;
                diagc++;
                
                
            }
            Collections.sort(al);
            int f=0;
             v=0;
            int fillr=r;
            int fillc=0;
            while(f!=al.size()){
              
               ans[fillr][fillc]=al.get(f);
               f++;
               
                fillr++;
                fillc++;
              
            }
          }
          
         for(int c=1;c<m;c++){
             ArrayList<Integer> al=new ArrayList<>();
             int diagr=0;
             int diagc=c;
             while(diagr<n&&diagc<m){
                 al.add(mat[diagr][diagc]);
                 diagr++;
                 diagc++;
             }
             Collections.sort(al);
             int f=0;
             int fillr=0;
             int fillc=c;
             while(fillr<n&&fillc<m){
                 ans[fillr][fillc]=al.get(f);
                 f++;
                 fillr++;
                 fillc++;
             }
         }
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 System.out.print(ans[i][j]+(j==m-1?"":" "));
             }
             System.out.println();
         }
         
          
       
       

    }
}
