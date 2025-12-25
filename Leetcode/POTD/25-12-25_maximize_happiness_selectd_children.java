class Solution {
    public long maximumHappinessSum(int[] arr, int k) {
        Arrays.sort(arr);
    for(int i=0;i<arr.length/2;i++){
        int temp=arr[i];
        arr[i]=arr[arr.length-1-i];
        arr[arr.length-1-i]=temp;
    }
    long tom=k;
    int i=0;
    long sum=0;
    int flg=0;
    int cnt=0;
  
    
    long toadd=0;
    while(i<k){
        toadd=arr[i]-i;
        if(toadd<=0)
        toadd=0;
        sum+=toadd;
        i++;
    }
   
    return sum;
        
    }
}
