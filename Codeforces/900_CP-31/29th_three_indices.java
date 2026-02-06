import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] p=new int[n];
            for(int i=0;i<n;i++){
                p[i]=sc.nextInt();
            }
            int[] lmin=new int[n];
            int[] rmin=new int[n];
            lmin[0]=0;
            for(int i=1;i<n;i++){
                if(p[i]<p[lmin[i-1]])lmin[i]=i;
                else lmin[i]=lmin[i-1];
            }
            rmin[n-1]=n-1;
            for(int i=n-2;i>=0;i--){
                if(p[i]<p[rmin[i+1]])rmin[i]=i;
                else rmin[i]=rmin[i+1];
            }
            boolean ok=false;
            for(int j=1;j<n-1;j++){
                if(p[lmin[j-1]]<p[j]&&p[rmin[j+1]]<p[j]){
                    System.out.println("YES");
                    System.out.println((lmin[j-1]+1)+" "+(j+1)+" "+(rmin[j+1]+1));
                    ok=true;
                    break;
                }
            }
            if(!ok)System.out.println("NO");
        }
    }
}
