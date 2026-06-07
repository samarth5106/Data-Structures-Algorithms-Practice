class Solution {
    public List<String> generateValidStrings(int n, int k) {
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<(1<<n);i++){
            String s=Integer.toBinaryString(i);
            while(s.length()<n){
                s="0"+s;
            }
            boolean valid=true;
            int cost=0;
            for(int j=0;j<n;j++){
                if(s.charAt(j)=='1'){
                    cost+=j;
                }
                if(j>0&&s.charAt(j)=='1'&&s.charAt(j-1)=='1'){
                    valid=false;
                    break;
                }
            }
            if(valid&&cost<=k){
                al.add(s);
            }
        }
        return al;
    }
}©leetcode
