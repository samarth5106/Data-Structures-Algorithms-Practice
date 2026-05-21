class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int maxi=0;
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            
            while(arr1[i]!=0){
                hs.add(arr1[i]);
                arr1[i]=arr1[i]/10;
            }
        }

        for(int i=0;i<arr2.length;i++){
            while(arr2[i]!=0){
                int prfx=arr2[i];
                if(hs.contains(prfx)){
                    String s=Long.toString(arr2[i]);
                    maxi=Math.max(s.length(),maxi);
                    break;
                }
                arr2[i]=arr2[i]/10;
            }
        }

        return maxi;
    }
}
