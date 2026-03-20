import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[][] arr = new int[n][2]; // {value, index}
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = i + 1;
            }

            // sort descending by frequency
            Arrays.sort(arr, (a, b) -> b[0] - a[0]);

            int[] ans = new int[n + 1];
            ans[0] = 0;

            int pos = 1;

            // assign positions: +1, -1, +2, -2 ...
            for (int i = 0; i < n; i++) {
                int idx = arr[i][1];

                if (i % 2 == 0) {
                    ans[idx] = pos;
                } else {
                    ans[idx] = -pos;
                    pos++;
                }
            }

            long val = 0;

            for (int i = 0; i < n; i++) {
                int idx = arr[i][1];
                val += 2L * Math.abs(ans[idx]) * arr[i][0];
            }

            System.out.println(val);

            for (int i = 0; i <= n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
