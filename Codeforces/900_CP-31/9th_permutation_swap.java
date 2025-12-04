import java.util.Scanner;
import java.util.ArrayList;
public class Main{
        static int gcd(int a,int b){
            while(b!=0){
                int temp=a%b;
                a=b;
                b=temp;
            }
            return a;
        }
public static void main(String[] args){
    
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t-->0){
            int n;
            n=sc.nextInt();
            int diff;
            ArrayList<Integer> arr=new ArrayList<>();
            int g=0;
            //int maxi=0;
            for(int i=0;i<n;i++){
                arr.add(sc.nextInt());
                diff=Math.abs(arr.get(i)-(i+1));
                if(diff==0){
                    continue;
                }
                else{
                    g=gcd(g,diff);
                    //maxi=Math.max(maxi,g);
                    
                }
               
            }
            if(g==0) g=n-1;
            System.out.println(g);
        }



    }



}
