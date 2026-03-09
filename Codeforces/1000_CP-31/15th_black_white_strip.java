import java.util.*;


public class Main
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int t;
       t=sc.nextInt();
       while(t-->0)
       {
          int n,k;
          n=sc.nextInt();
          k=sc.nextInt();
         String s;
        s=sc.next();
          int l=0,r=k-1;
          int mini=Integer.MAX_VALUE;
          int ans=0;
          for(int i=0;i<=r;i++){
              if(s.charAt(i)=='W'){
                  ans++;
              }
          }
        mini=Math.min(mini,ans);
          while(r<n-1){
              if(s.charAt(l)=='W'){
                  ans--;
              }
              l++;
              r++;
               if(s.charAt(r)=='W'){
              ans++;
          }
             mini=Math.min(mini,ans);
            
          }
         System.out.println(mini);
       }
       

    }
}
