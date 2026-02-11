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
          int sum=0;
          int[] a=new int[n];
          for(int i=0;i<n;i++){
              a[i]=sc.nextInt();
              sum+=a[i];
          }
          int[] b=new int[n];
          for(int i=0;i<n;i++){
              b[i]=sc.nextInt();
          }
          
          int minLoss=Integer.MAX_VALUE;
          for(int i=0;i<n;i++){
              minLoss=Math.min(minLoss,a[i]-b[i]);
          }
          
          sum-=minLoss;
          System.out.println(sum);
       }
    }
}
