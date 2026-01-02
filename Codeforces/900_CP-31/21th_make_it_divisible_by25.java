import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next(); // FIX HERE
            int ans=Integer.MAX_VALUE;

            for(int i=s.length()-1;i>=0;i--){
                char c=s.charAt(i);
                for(int j=i-1;j>=0;j--){
                    int check=(s.charAt(j)-'0')*10+(c-'0');
                    if(check%25==0){
                        int steps=(s.length()-1-i)+(i-j-1);
                        ans=Math.min(ans,steps);
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
