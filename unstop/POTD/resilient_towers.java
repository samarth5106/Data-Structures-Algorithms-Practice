import java.util.*;

public class Main {

    static int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }

    public static int calculateRemainingTowers(int N,int K,int M,int[] heights){
        Stack<Integer> st=new Stack<>();
        int skips=M;

        for(int i=0;i<N;i++){
            st.push(heights[i]);

            while(st.size()>=2){
                int b=st.pop();
                int a=st.pop();

                if(gcd(a,b)>K){
                    if(skips>0){
                        skips--;
                        st.push(a);
                        st.push(b);
                        break;
                    }else{
                        st.push(a+b);
                    }
                }else{
                    st.push(a);
                    st.push(b);
                    break;
                }
            }
        }
        return st.size();
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int M=sc.nextInt();
        int[] heights=new int[N];
        for(int i=0;i<N;i++){
            heights[i]=sc.nextInt();
        }
        System.out.println(calculateRemainingTowers(N,K,M,heights));
    }
}
