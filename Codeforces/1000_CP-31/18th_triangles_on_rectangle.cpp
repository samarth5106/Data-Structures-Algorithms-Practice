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
          int w,h;
          w=sc.nextInt();
          h=sc.nextInt();
          int k;
          k=sc.nextInt();
          int[] x1= new int[k];
          for(int i=0;i<k;i++){
              x1[i]=sc.nextInt();
          }
          long bse1=x1[k-1]-x1[0];
          k=sc.nextInt();
          int[] x2= new int[k];
          for(int i=0;i<k;i++){
              x2[i]=sc.nextInt();
          }
          long bse2=x2[k-1]-x2[0];
          long ar1=h*Math.max(bse1,bse2);
          
          k=sc.nextInt();
          int[] y1= new int[k];
          for(int i=0;i<k;i++){
              y1[i]=sc.nextInt();
          }
          long ht1=y1[k-1]-y1[0];
          
          k=sc.nextInt();
          int[] y2= new int[k];
          for(int i=0;i<k;i++){
              y2[i]=sc.nextInt();
          }
          long ht2=y2[k-1]-y2[0];
          
          long ar2=w*Math.max(ht1,ht2);
          
          System.out.println(Math.max(ar1,ar2));
          
          
          
       }
       

    }
}
