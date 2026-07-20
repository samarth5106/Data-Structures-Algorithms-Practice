class Solution {
    public ArrayList<String> findPrefixes(String[] arr) {
        // code here
        ArrayList<String> ans=new ArrayList<>();
       // Arrays.sort(arr);
        //dog, dove, duck, zebra
         for(int i=0;i<arr.length;i++){
            StringBuilder prfx=new StringBuilder();
            String current=arr[i];
            int j=0;
           // int nxt=i+1;
            while(j<current.length()){
               
                boolean mila=true;
                prfx.append(current.charAt(j));
                   for(int k=0;k<arr.length;k++){
                       if(k==i) continue;
                       if (arr[k].startsWith(prfx.toString())) {
                        mila = false;
                        break;
                    }
                   }
                   if(mila){
                        ans.add(prfx.toString());
                        break;
                    }
                   j++;
            }
            if (ans.size() <= i) {
                ans.add(current);
            }
           
         }
         return ans;//
    }
}
