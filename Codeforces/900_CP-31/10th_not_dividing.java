import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t-->0){
            int n;
            n=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                arr.add(sc.nextInt());
                
            }
            int v;
            if(arr.get(0)==1){
                arr.set(0,2);
            }
            for(int i=1;i<=n-1;i++){
                 
                if(arr.get(i)==1){
                   
                arr.set(i,2);
                }
               
                
               if(arr.get(i)%arr.get(i-1)==0){
                  v=arr.get(i)+1;
                   arr.set(i,v);
                   
               }
            }
            for(int i=0;i<n;i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
    }
}
