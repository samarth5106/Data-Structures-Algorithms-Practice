class Solution {
    public int maxProfit(int x,int y,int[] a,int[] b) {

        int n=a.length;
        Integer[] idx=new Integer[n];

        for(int i=0;i<n;i++){
            idx[i]=i;
        }

        Arrays.sort(idx,(i,j)->Math.abs(a[j]-b[j])-Math.abs(a[i]-b[i]));

        int sum=0;

        for(int id:idx){

            if((a[id]>=b[id]&&x>0)||y==0){
                sum+=a[id];
                x--;
            }
            else{
                sum+=b[id];
                y--;
            }
        }

        return sum;
    }
}
