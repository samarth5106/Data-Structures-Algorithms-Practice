import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                map.put(a[i],map.getOrDefault(a[i],0)+1);
            }

            int maxFreq=0;
            for(int v:map.values()){
                if(v>maxFreq) maxFreq=v;
            }

            int need=n-maxFreq;
            int ops=0;

            while(need>0){
                ops++; // clone
                int can=Math.min(maxFreq,need);
                ops+=can; // swaps
                maxFreq+=can;
                need-=can;
            }

            System.out.println(ops);
        }
    }
}
