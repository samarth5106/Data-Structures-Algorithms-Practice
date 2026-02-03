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
          long n;
          n=sc.nextLong();
          long last=n%10;
          if(last%2==1){
              System.out.println("Yes");
          }
          else {
              if((n&(n-1))==0){
                  System.out.println("No");}
                  else{
                      System.out.println("Yes");
                  }
              
          }
       }
       

    }
}
