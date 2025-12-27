import java.util.*;

class Solution{
    public int mostBooked(int n,int[][] meetings){
        Arrays.sort(meetings,(a,b)->a[0]-b[0]);

        PriorityQueue<Integer> free=new PriorityQueue<>();
        for(int i=0;i<n;i++) free.add(i);

        PriorityQueue<long[]> busy=new PriorityQueue<>(
            (a,b)->a[0]==b[0] ? (int)(a[1]-b[1]) : (int)(a[0]-b[0])
        );

        int[] count=new int[n];

        for(int[] m:meetings){
            long start=m[0],end=m[1];
            long dur=end-start;

            while(!busy.isEmpty()&&busy.peek()[0]<=start){
                free.add((int)busy.poll()[1]);
            }

            if(!free.isEmpty()){
                int room=free.poll();
                busy.add(new long[]{end,room});
                count[room]++;
            }
            else{
                long[] cur=busy.poll();
                long newEnd=cur[0]+dur;
                busy.add(new long[]{newEnd,cur[1]});
                count[(int)cur[1]]++;
            }
        }

        int ans=0;
        for(int i=1;i<n;i++){
            if(count[i]>count[ans]) ans=i;
        }
        return ans;
    }
}
