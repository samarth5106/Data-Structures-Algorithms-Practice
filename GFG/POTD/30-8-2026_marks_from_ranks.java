class Solution {
    public ArrayList<Integer> getMarks(int[] l, int[] r, int[] rank) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            int strt=l[i];
            int end=r[i];
            for(int j=strt;j<=end;j++){
                ans.add(j);
            }
        }
        
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<rank.length;i++){
            res.add(ans.get(rank[i]-1));
        }
        return res;
        
    }
}
