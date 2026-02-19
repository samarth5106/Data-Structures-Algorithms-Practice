import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }

            if(k==2||k==3||k==5){
                int ans=Integer.MAX_VALUE;
                for(int i=0;i<n;i++){
                    if(a[i]%k==0){
                        ans=0;
                        break;
                    }
                    int need=(k-a[i]%k)%k;
                    ans=Math.min(ans,need);
                }
                System.out.println(ans);
            }
            else{
                int twoCount=0;
                for(int i=0;i<n;i++){
                    int x=a[i];
                    while(x%2==0){
                        twoCount++;
                        x/=2;
                    }
                }

                if(twoCount>=2){
                    System.out.println(0);
                    continue;
                }

                int opt1=Integer.MAX_VALUE;
                for(int i=0;i<n;i++){
                    int need=(4-a[i]%4)%4;
                    opt1=Math.min(opt1,need);
                }

                int[] cost=new int[n];
                for(int i=0;i<n;i++){
                    if(a[i]%2==0) cost[i]=0;
                    else cost[i]=1;
                }
                Arrays.sort(cost);
                int opt2=cost[0]+cost[1];

                System.out.println(Math.min(opt1,opt2));
            }
        }
    }
}
