import java.util.*;

public class Main {
    public static int maximizeDeletedSteps(int N, int M, String S) {
        // Write your logic here.
        int R=0,L=0,F=0,B=0;
        for(char ch:S.toCharArray()){
            if(ch=='R') R++;
            else if(ch=='L')L++;
            else if(ch=='F')F++;
            else if(ch=='B')B++;
        }
        int targetX=N/2;
        int targty=M/2;
        if(R<targetX||F<targty){
            return -1;
        }
        int min=Math.abs(targetX)+Math.abs(targty);
        return S.length()-min;
      
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String S = scanner.next();
        
        int result = maximizeDeletedSteps(N, M, S);
        System.out.println(result);
    }
}
