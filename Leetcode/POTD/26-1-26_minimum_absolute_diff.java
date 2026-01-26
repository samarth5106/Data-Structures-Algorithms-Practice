import java.util.Arrays;
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int  mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            mini=Math.min(mini,arr[i+1]-arr[i]);
        }
        List<List<Integer>> ans=new ArrayList<>();
       // List<Integer> pair=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==mini){
                //pair.add(arr[i]);
               // pair.add(arr[i+1]);
                ans.add(List.of(arr[i],arr[i+1]));
            }
        }
        return ans;
    }
}
