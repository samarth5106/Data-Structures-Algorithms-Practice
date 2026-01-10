import java.util.*;

public class Main {
    static int maxAdditionalTrees(int[] P, int N) {
        // User logic goes here
        // Return the maximum number of additional trees that can be planted
        int cnt=0;
        if(N==1)
        return 1;
        
        for(int i=0;i<N;i++){
            if(i==0){
                if(P[i]==0&&P[i+1]==0){
                    cnt++;
                    P[i]=1;
                }
            }
            else if(i==N-1){
                if(P[i]==0&&P[i-1]==0){
                    cnt++;
                }
            }
            else if(P[i]==0&&P[i-1]==0&&P[i+1]==0){
                cnt++;
                P[i]=1;
            }
            
        }
        return cnt; // Placeholder return value
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = scanner.nextInt();
        }

        // Call the user logic function and print the result
        int result = maxAdditionalTrees(P, N);
        System.out.println(result);
    }
}
