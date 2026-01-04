import java.util.*;
public class Main{
    static boolean chkprime(int x){
        if(x<2)return false;
        for(int i=2;i*i<=x;i++){
            if(x%i==0)return false;
        }
        return true;
    }

    public static String solve(int N,int K,int M,String S,int[] P){
        char[] a=S.toCharArray();
        ArrayList<Integer> idx=new ArrayList<>();

        for(int i=0;i<K;i++){
            if(chkprime(P[i])){
                int t=P[i]-1;
                if(t>=0&&t<N)idx.add(t);
            }
        }

        int ops=M;
        for(int i=0;i<idx.size()&&ops>0;i++){
            int pi=idx.get(i);
            int best=i;
            for(int j=i+1;j<idx.size();j++){
                if(a[idx.get(j)]>a[idx.get(best)]){
                    best=j;
                }
            }
            if(a[idx.get(best)]>a[pi]){
                char tmp=a[pi];
                a[pi]=a[idx.get(best)];
                a[idx.get(best)]=tmp;
                ops--;
            }
        }
        return new String(a);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int M=sc.nextInt();
        sc.nextLine();
        String S=sc.nextLine();
        int[] P=new int[K];
        for(int i=0;i<K;i++)P[i]=sc.nextInt();
        System.out.println(solve(N,K,M,S,P));
    }
}
