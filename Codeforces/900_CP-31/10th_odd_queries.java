import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t-->0){
            int n,q;
            n=sc.nextInt();
            q=sc.nextInt();
            int sum=0;
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                arr.add(sc.nextInt());
                sum+=arr.get(i);
            }
            ArrayList<Integer> prfx=new ArrayList<>();
            int curr=0;
            prfx.add(0);
            for(int i=0;i<n;i++)
            {
                prfx.add(prfx.get(i)+arr.get(i));
                
            }
            int real=sum;
            while(q-->0){
                  int l,r,k;
            l=sc.nextInt();
            //l--;
            r=sc.nextInt();
            //r--;
            k=sc.nextInt();
            sum=real;
            
           sum-=prfx.get(r)-prfx.get(l-1);
           sum+=(r-l+1)*k;
            if(sum%2!=0){
                System.out.println("Yes");

            }
            else System.out.println("No");
            }



        }






    }






}
