import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int calculate_minimum_waste(int N, int M, int[] item_lengths, int[] roll_lengths) {
        Arrays.sort(item_lengths);
        Arrays.sort(roll_lengths);
        boolean[] canuse=new boolean[roll_lengths.length];
        Arrays.fill(canuse,true);
        int needed;
      int i=0,j=0;
      int waste=0;

      while(i<item_lengths.length){
        if(j==roll_lengths.length&&i<item_lengths.length)
        return -1;
        needed=item_lengths[i];
        if(roll_lengths[j]>=needed){
            waste+=roll_lengths[j]-needed;
            i++;
            j++;
            continue;
        }
        j++;
      }
    return waste;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] item_lengths = new int[N];
        int[] roll_lengths = new int[M];
        for (int i = 0; i < N; i++) {
            item_lengths[i] = scanner.nextInt();
        }
        for (int i = 0; i < M; i++) {
            roll_lengths[i] = scanner.nextInt();
        }

        int result = calculate_minimum_waste(N, M, item_lengths, roll_lengths);
        System.out.println(result);
    }
}
