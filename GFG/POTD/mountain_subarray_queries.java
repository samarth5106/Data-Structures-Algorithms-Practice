class Solution {
    public ArrayList<Boolean> processQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] go_up = new int[n];
        int[] go_down = new int[n];

        go_up[n-1] = n-1;
        for(int i = n-2; i >= 0; i--){
            if(arr[i] <= arr[i+1]) go_up[i] = go_up[i+1];
            else go_up[i] = i;
        }

        go_down[n-1] = n-1;
        for(int i = n-2; i >= 0; i--){
            if(arr[i] >= arr[i+1]) go_down[i] = go_down[i+1];
            else go_down[i] = i;
        }

        ArrayList<Boolean> result = new ArrayList<>();
        for(int[] q : queries){
            int l = q[0], r = q[1];
            int peak = Math.min(go_up[l], r);
            result.add(go_down[peak] >= r);
        }
        return result;
    }
}
