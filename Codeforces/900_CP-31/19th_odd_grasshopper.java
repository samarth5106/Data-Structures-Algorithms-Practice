import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long x = sc.nextLong();
            long n = sc.nextLong();
            
            long r = n % 4;
            long ans;
            
            if (r == 0) {
                ans = x;
            } else if (r == 1) {
                ans = x + n;
            } else if (r == 2) {
                ans = x + 1;
            } else { // r == 3
                ans = x - (n + 1);
            }
            
            System.out.println(ans);
        }
    }
}
