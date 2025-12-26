import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t--> 0) {
            int n;
            n = sc.nextInt();
            ArrayList < Integer > arr = new ArrayList < > ();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
 
            }
            long ans=0;
            for(int i=arr.size()-2;i>=0;i--){
                while(arr.get(i)>=arr.get(i+1)){
                    ans++;
                    arr.set(i,arr.get(i)/2);
                    if(arr.get(i)==0)break;
                }
                if(arr.get(i)==0&&arr.get(i+1)==0){
                    ans=-1;break;
                }
            }
            System.out.println(ans);
 
 
        }
    }
}
