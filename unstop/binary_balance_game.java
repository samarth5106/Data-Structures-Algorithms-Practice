import java.util.*;

public class Main {
    // Placeholder function where user will write their logic
    public static List<Integer> userLogic(int N) {
        int k=1;
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(0);
        int currnt=0;
        int cnt=0;
       while(k<=N){
        cnt=0;
        String bin=Integer.toBinaryString(k);
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'){
                cnt++;
            }
        }
        if(k%2==0){
            currnt+=cnt;
        }
        else{
            currnt-=cnt;
        }
        ans.add(currnt);
        k++;
       }
        return ans; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Input the number N

        // Call user logic function
        List<Integer> result = userLogic(N);

        // Print the output in the required format
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
