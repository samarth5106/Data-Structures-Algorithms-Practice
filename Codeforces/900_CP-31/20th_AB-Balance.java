import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int n=s.length();

            if(s.charAt(0)==s.charAt(n-1)){
                System.out.println(s);
            }else{
                char[] arr=s.toCharArray();
                arr[0]=arr[n-1]; // change first to last
                System.out.println(new String(arr));
            }
        }
    }
}
