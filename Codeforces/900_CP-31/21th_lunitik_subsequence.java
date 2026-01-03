import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int z=0,o=0;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(x==1) o++;
                else if(x==0) z++;
            }
            long ans=1L<<z;   // 2^z safely
            System.out.println(o*ans);
        }
    }
}
