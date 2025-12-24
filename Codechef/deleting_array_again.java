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
             ArrayList < Integer > crr = new ArrayList < > ();
            for (int i = 0; i < n; i++) {
                crr.add(sc.nextInt());

            }
            int kit=n;
            int ans=0;
            int idx=0;
            int sz=n-1;
            int mini=Integer.MAX_VALUE;
            while(kit-->0){
                mini=Integer.MAX_VALUE;
                for(int i=0;i<=sz;i++){
                    if(crr.get(i)<mini){
                        mini=crr.get(i);
                        idx=i;
                    }
                }
                    if(idx==sz){
                        ans+=arr.get(idx)*crr.get(idx);
                        sz--;
                    }
                    else{
                        int now=sz+1-idx;
                        int tosub=now;
                        int p=idx;
                        while(now-->0){
                            
                            ans+=arr.get(p)*crr.get(idx);
                            p++;
                        }
                        kit-=tosub;
                        kit++;
                        sz=idx-1;
                    }
                
            }
            
System.out.println(ans);

        }
    }
}
