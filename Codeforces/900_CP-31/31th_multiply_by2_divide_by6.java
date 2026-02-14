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
        //  int[] a=new int[n];
        int cnt=0;
        boolean done=false;
        while(n!=1){
            if(n==2||n%3!=0)
            { done=true;
                System.out.println("-1");
                break;
            }
            if(n%6!=0){
                n=n*2;
                cnt++;
            }
            else{
                n=n/6;
                cnt++;
            }
        }
        if(!done)
        System.out.println(cnt);
       }
       

    }
}
