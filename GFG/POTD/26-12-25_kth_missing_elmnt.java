class Solution{
    public int kthMissing(int[] arr,int k){
        int[] store=new int[k];
        int val=1;
        int p=0;

        for(int i=0;i<arr.length;i++){
            while(val<arr[i]){
                store[p]=val;
                p++;
                if(p==k) return store[p-1];
                val++;
            }
            val=arr[i]+1;
        }

        // if kth missing is after last element
        return arr[arr.length-1]+(k-p);
    }
}
