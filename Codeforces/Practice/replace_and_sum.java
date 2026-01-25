import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            int n;
            n = sc.nextInt();
            int q;
            q = sc.nextInt();
 
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
 
            ArrayList<Integer> brr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                brr.add(sc.nextInt());
            }
 
            for (int i = n - 1; i >= 0; i--) {
                if (i == n - 1) {
                    if (brr.get(i) > arr.get(i)) {
                        arr.set(i, brr.get(i));
                    }
                } else {
                    int maxi = Math.max(arr.get(i + 1), brr.get(i));
                    maxi = Math.max(maxi, arr.get(i));
                    arr.set(i, maxi);
                }
            }
            int[] prefxsm=new int[n];
            int sm=0;
            for(int i=0;i<n;i++){
                sm+=arr.get(i);
                prefxsm[i]=sm;
            }
            while (q-- > 0) {
                long sum = 0;
                int l = sc.nextInt() - 1;
                int r = sc.nextInt() - 1;
                if(l==0) sum=prefxsm[r];
                else{
                  sum=prefxsm[r]-prefxsm[l-1];
                
                }
                System.out.print(sum+" ");
               
            }
            System.out.println();
        }
    }
}
