import java.util.Scanner;

public class Main {
    // Placeholder function for user logic
    public static long maxWeightedScore(String S, int[] weights){
    int n=S.length();

    boolean[][] pal=new boolean[n][n];
    for(int i=0;i<n;i++){
        pal[i][i]=true;
    }
    for(int len=2;len<=n;len++){
        for(int i=0;i+len-1<n;i++){
            int j=i+len-1;
            if(S.charAt(i)==S.charAt(j)){
                if(len==2 || pal[i+1][j-1]) pal[i][j]=true;
            }
        }
    }

    int[] pref=new int[n+1];
    for(int i=0;i<n;i++){
        pref[i+1]=pref[i]+weights[S.charAt(i)-'a'];
    }

    int[] dp=new int[n+1];
    for(int i=1;i<=n;i++){
        dp[i]=0;
        for(int j=0;j<i;j++){
            if(pal[j][i-1]){
                int sum=pref[i]-pref[j];
                int len=i-j;
                dp[i]=Math.max(dp[i],dp[j]+len*sum);
            }
        }
    }
    return dp[n];
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Read the length of the string
        scanner.nextLine(); // Consume newline

        String S = scanner.nextLine(); // Read the string of length N

        int[] weights = new int[26];
        for (int i = 0; i < 26; ++i) {
            weights[i] = scanner.nextInt(); // Read the weights for characters 'A' to 'Z'
        }

        // Call the user logic function and output the result
        long result = maxWeightedScore(S, weights);
        System.out.println(result); // Print the maximum weighted score

        scanner.close();
    }
}

