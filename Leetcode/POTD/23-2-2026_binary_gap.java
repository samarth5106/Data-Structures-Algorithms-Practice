class Solution {
    public int binaryGap(int n) {
        String binary=Integer.toBinaryString(n);
        int dist=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                int j=i+1;
                int cnt=1;
                while(j<binary.length()&&binary.charAt(j)!='1'){
                    j++;
                    cnt++;
                }
                i=j-1;
                if(j!=binary.length())
                dist=Math.max(dist,cnt);
            }

        }
        return dist;
    }
}
