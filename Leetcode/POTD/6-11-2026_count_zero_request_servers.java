class pair{
    int val;
    int idx;
    pair(int val,int idx){
        this.val=val;
        this.idx=idx;
    }
}

class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int[] arr=new int[queries.length];

        //int[][] Q=new int[][];
        pair[] Q=new pair[queries.length];

        for(int i=0;i<queries.length;i++){
            pair pr=new pair(queries[i],i);
            Q[i]=pr;
        }

        Arrays.sort(logs,(a,b)->Integer.compare(a[1],b[1]));
        Arrays.sort(Q,(a,b)->Integer.compare(a.val,b.val));

        int i=0;
        int j=0;
         HashMap<Integer,Integer> mp=new HashMap<>();
        for(int l=0;l<Q.length;l++){
            pair pr=Q[l];
            int val=pr.val;
            int start =val-x;
            int end = val;
            int idx=pr.idx;
           

            while(j<logs.length&&logs[j][1]<=end){
                mp.put(logs[j][0],mp.getOrDefault(logs[j][0],0)+1);
                j++;

            }
            while(i<logs.length&&logs[i][1]<start){
                int server = logs[i][0];
                mp.put(server, mp.get(server) - 1);
                if (mp.get(server) == 0) {
                   mp.remove(server);
                }
                i++;
            }
            int cnt=mp.size();
            arr[idx]=n-cnt;

        }
        return arr;
    }
}
