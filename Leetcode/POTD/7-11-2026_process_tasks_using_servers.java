class pair{
    int wt;
    int idx;
    pair(int v,int i){
        wt=v;
        idx=i;
    }
}

class tuple{
    long finishtme;
    int wt;
    int idx;
    tuple(long ftme,int w,int i){
        finishtme=ftme;
        wt=w;
        idx=i;
    }
}

class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        int n=servers.length;
        int m=tasks.length;

        PriorityQueue<pair> freeserver = new PriorityQueue<>((a, b) -> {
            if (a.wt != b.wt) {
                return Integer.compare(a.wt, b.wt);
            }
            return Integer.compare(a.idx, b.idx);
        });

        PriorityQueue<tuple> busyserver=new PriorityQueue<>((a,b)->{
            if(a.finishtme!=b.finishtme){
                return Long.compare(a.finishtme,b.finishtme);
            }
            if(a.wt!=b.wt) return Integer.compare(a.wt, b.wt);
            return Integer.compare(a.idx, b.idx);
        });

        for(int i=0;i<n;i++){
            pair pr=new pair(servers[i],i);
            freeserver.offer(pr);
        }

        int[]ans=new int[tasks.length];
        long currentTime=0;

        for(int t=0;t<m;t++){

            currentTime=Math.max(currentTime,t);

            while(!busyserver.isEmpty()&&busyserver.peek().finishtme<=currentTime){
                tuple tp=busyserver.poll();
                freeserver.offer(new pair(tp.wt,tp.idx));
            }

            if(freeserver.isEmpty()){

                currentTime=busyserver.peek().finishtme;

                while(!busyserver.isEmpty()&&busyserver.peek().finishtme<=currentTime){
                    tuple tp=busyserver.poll();
                    freeserver.offer(new pair(tp.wt,tp.idx));
                }
            }

            pair pr=freeserver.poll();
            int wt=pr.wt;
            long finish=currentTime+tasks[t];
            int idx=pr.idx;

            tuple tp=new tuple(finish,wt,idx);
            busyserver.offer(tp);
            ans[t]=idx;
        }

        return ans;
    }
}
