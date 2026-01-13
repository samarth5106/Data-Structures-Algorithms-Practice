import java.util.Scanner;

public class Main {
   

    static boolean ispk(int[] a,int i){
        if(i<=0||i>=a.length-1)return false;
        return a[i]>a[i-1]&&a[i]>a[i+1];
    }

    static int cntpk(int[] a){
        int c=0;
        for(int i=1;i<a.length-1;i++){
            if(ispk(a,i))c++;
        }
        return c;
    }

    public static void minimumEnergyPeaks(int n,int[] arr){
        int base=cntpk(arr);
         if(base==0){
            System.out.println(0);
            return ;
         }
        int ans=base;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int l=Math.max(1,i-1);
                int r=Math.min(n-2,j+1);
                int before=0,after=0;
                for(int k=l;k<=r;k++){
                    if(ispk(arr,k))before++;
                }
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
                for(int k=l;k<=r;k++){
                    if(ispk(arr,k))after++;
                }
                tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
                ans=Math.min(ans,base-before+after);
            }
        }
       
        System.out.println(ans);
    }

    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call user logic function and print the output
        minimumEnergyPeaks(n, arr);
        // System.out.println(result); // Uncomment and implement the function to use
    }
}
