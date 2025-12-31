import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            boolean ok=false;

            // case 1: multiply a
            if(a!=0){
                long num=2*b-c;
                if(num%a==0&&num/a>0) ok=true;
            }

            // case 2: multiply b
            if(!ok&&b!=0){
                long num=a+c;
                if(num%(2*b)==0&&num/(2*b)>0) ok=true;
            }

            // case 3: multiply c
            if(!ok&&c!=0){
                long num=2*b-a;
                if(num%c==0&&num/c>0) ok=true;
            }

            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
