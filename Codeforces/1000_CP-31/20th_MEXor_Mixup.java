import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int xr = 0;
            // Loop from 0 to a-1 (your way)
           int n = a - 1;

if (n % 4 == 0) xr = n;
else if (n % 4 == 1) xr = 1;
else if (n % 4 == 2) xr = n + 1;
else xr = 0;

            
            // Case 1: XOR is already b
            if (xr == b) {
                System.out.println(a);
            } 
            // Case 2: The number we need to add is exactly 'a'
            // We can't add 'a' because MEX must be 'a'. 
            // So we add two other numbers that XOR to the needed value.
            else if ((xr ^ b) == a) {
                System.out.println(a + 2);
            } 
            // Case 3: We just need to add one number (that isn't 'a')
            else {
                System.out.println(a + 1);
            }
        }
    }
}
