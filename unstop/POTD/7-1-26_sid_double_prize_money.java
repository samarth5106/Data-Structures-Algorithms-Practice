import java.util.*;
public class Main{
    static boolean isP(int x){
        if(x<2)return false;
        for(int i=2;i*i<=x;i++) if(x%i==0) return false;
        return true;
    }
    static boolean isDP(int x){
        return isP(x)&&isP(x+2);
    }
    public static void user_logic(int n,int[] prices){
        int bestlen=1,bestsum=0;
        int curlen=1,cursum=0;
        if(isDP(prices[0])) cursum=prices[0];
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                curlen++;
                if(isDP(prices[i])) cursum+=prices[i];
            }else{
                if(curlen>bestlen || (curlen==bestlen && cursum>bestsum)){
                    bestlen=curlen;
                    bestsum=cursum;
                }
                curlen=1;
                cursum=isDP(prices[i])?prices[i]:0;
            }
        }
        if(curlen>bestlen || (curlen==bestlen && cursum>bestsum)){
            bestlen=curlen;
            bestsum=cursum;
        }
        System.out.println(bestlen+" "+bestsum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] prices=new int[n];
        for(int i=0;i<n;i++) prices[i]=sc.nextInt();
        user_logic(n,prices);
    }
}
