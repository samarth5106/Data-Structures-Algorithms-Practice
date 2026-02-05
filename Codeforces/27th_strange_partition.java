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
          int n;
          n=sc.nextInt();
          int x;
          x=sc.nextInt();
          int[] a=new int[n];
          long maxans=0;
          long sum=0;
          for(int i=0;i<n;i++){
              a[i]=sc.nextInt();
              maxans+=(a[i]+x-1)/x;
              sum+=a[i];
              
          }
          
      long minans=(sum+x-1)/x;
      System.out.println(minans+" "+maxans);
          
       }
       

    }
}
