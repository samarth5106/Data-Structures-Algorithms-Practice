class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum=0;
        
        for(int i=cost.length-1;i>=0;i-=3){
            int j=i-1;
            sum+=cost[i];
            if(j>=0) sum+=cost[j];
        }
        return sum;

    }
}
