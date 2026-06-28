class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] oi, int freestart, int freeend) {
        Arrays.sort(oi,(a,b)->Integer.compare(a[0],b[0]));
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<oi.length;i++){
            int start=oi[i][0];
            int end=oi[i][1];
            //int newend;
            int j=i+1;
            while(j<oi.length&&end+1>=oi[j][0]){
                end=Math.max(end,oi[j][1]);
                j++;
                
            }
            //start=1
            //newend=3
i=j-1;
            
             List<Integer> intr=new ArrayList<>();
            
                if(end<freestart||start>freeend){
                    intr.add(start);
                    intr.add(end);
                    ans.add(intr);
                }
            else{
                if(start<freestart){
                    intr.add(start);
                    intr.add(freestart-1);
                    ans.add(intr);
                }
                
             List<Integer> intr2=new ArrayList<>();
                if(end>freeend){
                    intr2.add(freeend+1);
                    intr2.add(end);
                    ans.add(intr2);
                }
            }
            
            
           
            
        }
        return ans;
    }
}©leetcode
