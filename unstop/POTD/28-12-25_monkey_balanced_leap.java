import java.util.*;

public class Main{
    public static String can_reach(int[] W,int K){
        int n=W.length;

        long[] suf=new long[n];
        suf[n-1]=Math.abs(W[n-1]);
        for(int i=n-2;i>=0;i--){
            suf[i]=suf[i+1]+Math.abs(W[i]);
        }

        ArrayList<HashSet<Long>> dp=new ArrayList<>();
        for(int i=0;i<n;i++) dp.add(new HashSet<>());

        dp.get(0).add((long)W[0]);

        for(int i=0;i<n;i++){
            for(long sum:dp.get(i)){
                for(int j=i+1;j<n&&j<=i+K;j++){
                    long ns=sum+W[j];
                    if(Math.abs(ns)<=suf[j]){
                        if(j==n-1&&ns==0L) return "YES";
                        dp.get(j).add(ns);
                    }
                }
            }
        }
        return dp.get(n-1).contains(0L)?"YES":"NO";
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int[] W=new int[N];
        for(int i=0;i<N;i++) W[i]=sc.nextInt();
        System.out.println(can_reach(W,K));
    }
}
