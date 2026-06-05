class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);//7 8 9 10
        Arrays.sort(s);//5 6 7 8
        int cnt=0;
       int l=0;
       int child=0;
       while(child<g.length&&l<s.length){
        int greed=g[child];
         while(l<s.length){
            if(s[l]>=greed){
                cnt++;break;
            }
            l++;
         }
         l++;
         child++;
       }
       return cnt;
    }
}
