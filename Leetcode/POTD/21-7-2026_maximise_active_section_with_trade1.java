class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') ones++;
        }
        ArrayList<Integer> zr=new ArrayList<>();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='0'){
                int cnt=0;
                while(i<s.length()&&s.charAt(i)=='0'){
                    cnt++;
                    i++;
                }
                zr.add(cnt);
            }
            i++;
        }
        int maxi=0;
        for(int j=0;j<zr.size()-1;j++){
            maxi=Math.max(maxi,zr.get(j)+zr.get(j+1));
        }
        return ones+maxi;
    }
}
