class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            Map<Character,Integer> mp=new HashMap<>();
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
            for(int j=i+1;j<s.length();j++){
                mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
                 int minFreq = Integer.MAX_VALUE;
                 int maxFreq = Integer.MIN_VALUE;
                for(int val:mp.values()){
                    minFreq=Math.min(minFreq,val);
                    maxFreq=Math.max(maxFreq,val);

                }
                sum+=maxFreq-minFreq;
            }
        }
        return sum;
    }
}
