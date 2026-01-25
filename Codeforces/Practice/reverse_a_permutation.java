import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            int n;
            n = sc.nextInt();
            int maxi = 0;
            ArrayList<Integer> prr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                prr.add(sc.nextInt());
            }

            int from = -1;
            int end = -1;
            int strt = n;
            int optpos = 1;

            for (int i = 0; i < n; i++) {
                boolean done = false;
                if (i + 1 == optpos && prr.get(i) == strt) {
                    strt--;
                    optpos++;
                } else {
                    from = i;
                    for (int j = i + 1; j < n; j++) {
                        if (prr.get(j) == strt) {
                            end = j;
                            done = true;
                            break;
                        }
                    }
                    if (done)
                        break;
                }
            }

            if (from != -1 && end != -1) {
                int l = from, r = end;
                while (l < r) {
                    int tmp = prr.get(l);
                    prr.set(l, prr.get(r));
                    prr.set(r, tmp);
                    l++;
                    r--;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(prr.get(i) + " ");
            }
            System.out.println();
        }
    }
}
