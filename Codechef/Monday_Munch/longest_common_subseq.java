import java.util.*;


public class Main
{
    static int solve(int i,int j,String s,String r,int[][] dp){
        if(i>=s.length()||j>=r.length()){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int a=0;
            int b=0;
        int c=0;
        int d=0;
        if(s.charAt(i)==r.charAt(j)){
           a=1+ solve(i+1,j+1,s,r,dp);
        }
        
    
        else{
           b= solve(i,j+1,s,r,dp);
             d=solve(i+1,j,s,r,dp);
        }
        
        return dp[i][j]=Math.max(a,Math.max(b,d));
        
        
        
        
    }
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int t;
       t=sc.nextInt();
       while(t-->0)
       {
            
          String s;
          s=sc.next();
          String r;
          r=sc.next();
          int[][] dp=new int[s.length()][r.length()];
            for(int i=0;i<s.length();i++){
                Arrays.fill(dp[i],-1);
            }
       //   StringBuilder sb=new StringBuilder();
          int ans=solve(0,0,s,r,dp);
          //cout<<ans<<endl;
          System.out.println(ans);
          
       }
       

    }
}
