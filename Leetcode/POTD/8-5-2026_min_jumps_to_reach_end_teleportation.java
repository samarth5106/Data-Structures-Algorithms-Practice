import java.util.*;

class Solution {

    boolean isPrime(int n){
        if(n <= 1) return false;

        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }

        return true;
    }

    public int minJumps(int[] nums) {

        int n = nums.length;

        if(n == 1) return 0;

        // prime -> indices divisible by that prime
        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for(int i=0;i<n;i++){

            for(int d=2;d*d<=nums[i];d++){

                if(nums[i]%d==0){

                    if(isPrime(d)){
                        map.putIfAbsent(d,new ArrayList<>());
                        map.get(d).add(i);
                    }

                    int other = nums[i]/d;

                    if(other!=d && isPrime(other)){
                        map.putIfAbsent(other,new ArrayList<>());
                        map.get(other).add(i);
                    }
                }
            }

            if(isPrime(nums[i])){
                map.putIfAbsent(nums[i],new ArrayList<>());
                map.get(nums[i]).add(i);
            }
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];

        q.offer(0);
        vis[0] = true;

        int jumps = 0;

        HashSet<Integer> usedPrime = new HashSet<>();

        while(!q.isEmpty()){

            int size = q.size();

            while(size-- > 0){

                int idx = q.poll();

                if(idx == n-1) return jumps;

                // left
                if(idx-1 >= 0 && !vis[idx-1]){
                    vis[idx-1] = true;
                    q.offer(idx-1);
                }

                // right
                if(idx+1 < n && !vis[idx+1]){
                    vis[idx+1] = true;
                    q.offer(idx+1);
                }

                // teleport
                int val = nums[idx];

                if(isPrime(val) && !usedPrime.contains(val)){

                    usedPrime.add(val);

                    if(map.containsKey(val)){

                        for(int next : map.get(val)){

                            if(!vis[next]){
                                vis[next] = true;
                                q.offer(next);
                            }
                        }
                    }
                }
            }

            jumps++;
        }

        return -1;
    }
}
