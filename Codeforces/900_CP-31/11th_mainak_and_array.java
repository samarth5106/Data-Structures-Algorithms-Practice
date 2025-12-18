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
            int ans=arr.get(n-1)-arr.get(0);
            for(int i=0;i<n;i++){
                ans=Math.max(ans,arr.get(i)-arr.get(0));
            }
              for(int i=0;i<n;i++){
                  ans=Math.max(ans,arr.get(n-1)-arr.get(i));
              }
                for(int i=0;i<n-1;i++){
                    ans=Math.max(ans,arr.get(i)-arr.get(i+1));
                }
            
            
          System.out.println(ans);
          
        }
    }
}
