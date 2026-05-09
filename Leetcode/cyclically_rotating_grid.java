class Solution {
    static void reverse(ArrayList<Integer> arr,int start,int end){
        while(start<end){
            int temp=arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }
    }
    public int[][] rotateGrid(int[][] grid,int k){
        int m=grid.length;
        int n=grid[0].length;
        int layers=Math.min(m/2,n/2);
        int[][] ans=new int[m][n];
        for(int layr=0;layr<layers;layr++){
            int top=layr;
            int left=layr;
            int right=n-1-layr;
            int bottom=m-1-layr;
            ArrayList<Integer> nums=new ArrayList<>();
            for(int i=left;i<=right;i++)nums.add(grid[top][i]);
            for(int i=top+1;i<=bottom;i++)nums.add(grid[i][right]);
            for(int i=right-1;i>=left;i--)nums.add(grid[bottom][i]);
            for(int i=bottom-1;i>top;i--)nums.add(grid[i][left]);
            int sz=nums.size();
            int shift=k%sz;
            reverse(nums,0,shift-1);
            reverse(nums,shift,sz-1);
            reverse(nums,0,sz-1);
            int idx=0;
            for(int i=left;i<=right;i++)ans[top][i]=nums.get(idx++);
            for(int i=top+1;i<=bottom;i++)ans[i][right]=nums.get(idx++);
            for(int i=right-1;i>=left;i--)ans[bottom][i]=nums.get(idx++);
            for(int i=bottom-1;i>top;i--)ans[i][left]=nums.get(idx++);
        }
        return ans;
    }
}


