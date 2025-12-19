import java.util.*;
 
public class Main {
    static int ghsd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int l = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
 
            int g =ghsd(l, b);
 
            int ans = (l - 1) - ((l - 1 - a) % g);
            System.out.println(ans);
        }
    }
}
