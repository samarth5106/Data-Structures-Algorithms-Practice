import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t--> 0) {
            int n;
            n = sc.nextInt();
            int maxi=0;
            ArrayList < Integer > arr = new ArrayList < > ();
     
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
              
            }
                 int ans=arr.get(0);
                 for(int i=1;i<arr.size();i++){
                      ans=ans&arr.get(i);
                 }
          System.out.println(ans);
            


        }
    }
}
