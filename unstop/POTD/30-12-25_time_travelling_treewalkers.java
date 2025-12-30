import java.util.*;

public class Main {
    // Placeholder for the user logic function
    // Parameters:
    // - N: number of nodes
    // - K: maximum allowed difference for teleportation
    // - T: array of timestamps for each node (1-indexed)
    // - edges: array of pairs representing the edges of the tree
    // Returns:
    // - long: the minimum total time to visit all nodes at least once
    static long user_logic(int N, int K, int[] T, int[][] edges) {

    ArrayList<ArrayList<Integer>> g = new ArrayList<>();
    for(int zz=0;zz<=N;zz++){
        g.add(new ArrayList<>());
    }

    for(int zz=0;zz<edges.length;zz++){
        int aa = edges[zz][0];
        int bb = edges[zz][1];
        g.get(aa).add(bb);
        g.get(bb).add(aa);
    }

    boolean[] seen = new boolean[N+1];

    long ans = 2L * (N - 1);

    Stack<Integer> st = new Stack<>();
    Stack<Integer> par = new Stack<>();

    st.push(1);
    par.push(0);
    seen[1] = true;

    while(!st.isEmpty()){
        int uuu = st.pop();
        int ppp = par.pop();

        for(int vvv : g.get(uuu)){
            if(vvv == ppp) continue;
            if(seen[vvv]) continue;

            seen[vvv] = true;

            if(Math.abs(T[uuu] - T[vvv]) <= K){
                ans--;
            }

            st.push(vvv);
            par.push(uuu);
        }
    }

    return ans;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] T = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
            T[i] = scanner.nextInt();
        }

        int[][] edges = new int[N - 1][2];
        for (int i = 0; i < N - 1; ++i) {
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
        }

        // Call user logic function and print the output
        long result = user_logic(N, K, T, edges);
        System.out.println(result);

        scanner.close();
    }
}
