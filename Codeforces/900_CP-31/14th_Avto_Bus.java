import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();

            if(n%2!=0 || n<4){
                System.out.println(-1);
                continue;
            }

            long max=n/4;
            long min;

            if(n%6==0){
                min=n/6;
            }
            else if(n%6==2){
                min=(n-8)/6+2;
            }
            else{
                min=(n-4)/6+1;
            }

            if(min<0) System.out.println(-1);
            else System.out.println(min+" "+max);
        }
    }
}
