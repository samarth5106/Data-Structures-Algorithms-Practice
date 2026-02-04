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
            long[] ans=new long[(n*k)+1];
           
            for(int i=1;i<(n*k)+1;i++){
                ans[i]=sc.nextLong();
            }

           // Arrays.sort(ans);

            long starting=(long)(Math.ceil(n/2.0))-1;
            long ending=(n-starting);
            starting =k*starting ;
          
            long sum=0;
           
            int val=(int)(starting+1); 
            while(k-->0){
                sum+=ans[val];
                val+=ending;
                
            }
            System.out.println(sum);
          
        }
    }
}
