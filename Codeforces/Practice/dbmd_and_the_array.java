import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t--> 0) {
            int n;
            n = sc.nextInt();
            int s,x;
            s=sc.nextInt();
            x=sc.nextInt();
            int sum=0;
            ArrayList < Integer > arr = new ArrayList <> ();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
                sum+=arr.get(i);

            }
            if(sum==s){
                System.out.println("Yes");
                continue;
            }
            else{
                int diff=s-sum;
                if(diff<0){
                    System.out.println("No");
                    continue;
                }
                else {
                    if(diff%x==0){
                        System.out.println("Yes");
                        
                    }
                    else{
                         System.out.println("No");
                    }
                }
            }
            
        }
    }
}
