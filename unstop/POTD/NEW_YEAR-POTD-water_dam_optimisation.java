import java.util.Scanner;

public class Main {
    // Function where user will write their logic
    static int maxWaterRetained(int[] capacity, int[] initial, int lossPercent) {
         int received=0;
    int tosub;
    int now=0;
    int back;
    int N=initial.length;
    if(initial[0]>capacity[0]){
        initial[0]=capacity[0];
    }
    back=initial[0];
    
    for(int i=1;i<N;i++){
        tosub=(int)Math.ceil(back*lossPercent/100.0);
        back-=tosub;
        received=initial[i]+back;
        if(received>capacity[i]){
            received=capacity[i];
        }
        back=received;
    }

    return back;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // Read the number of chambers
        
        int[] capacity = new int[N];
        int[] initial = new int[N];
        
        // Read the capacities of the chambers
        for (int i = 0; i < N; ++i) {
            capacity[i] = scanner.nextInt();
        }

        // Read the initial water levels in the chambers
        for (int i = 0; i < N; ++i) {
            initial[i] = scanner.nextInt();
        }

        int lossPercent = scanner.nextInt();  // Read the loss percentage

        // Call the user logic function
        int result = maxWaterRetained(capacity, initial, lossPercent);

        // Print the result
        System.out.println(result);

        scanner.close();
    }
}
