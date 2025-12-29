import java.util.Scanner;

public class Main{
    public static long minClimbingEffort(int[] heights){
        int zz=heights.length;
        long[] blob=new long[zz];
        for(int i=0;i<zz;i++){
            blob[i]=Long.MAX_VALUE;
        }
        blob[0]=0;

        for(int x=1;x<zz;x++){
            for(int y=0;y<x;y++){
                long junk=Math.abs((long)heights[x]-(long)heights[y])*(x-y);
                if(blob[y]+junk<blob[x]){
                    blob[x]=blob[y]+junk;
                }
            }
        }
        return blob[zz-1];
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[] heights=new int[N];
        for(int i=0;i<N;i++){
            heights[i]=scanner.nextInt();
        }
        long result=minClimbingEffort(heights);
        System.out.println(result);
    }
}
