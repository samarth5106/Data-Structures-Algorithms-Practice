class Solution {
    public int maxCharGap(String s) {
        // code here
        int[][] arr=new int[26][2];
for(int i=0;i<26;i++){
    Arrays.fill(arr[i],-1);
}
int maxi=-1;
for(int i=0;i<s.length();i++){
        if(arr[s.charAt(i)-97][0]==-1)
    arr[s.charAt(i)-97][0]=i;
    
    if(arr[s.charAt(i)-97][0]!=-1){
        arr[s.charAt(i)-97][1]=i;
        maxi=Math.max(maxi,i-arr[s.charAt(i)-97][0]-1);
    }
    
}
return maxi;
    }
};
