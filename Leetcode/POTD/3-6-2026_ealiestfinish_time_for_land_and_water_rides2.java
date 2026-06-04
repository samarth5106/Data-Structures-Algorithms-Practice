class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, 
                            int[] waterStartTime, int[] waterDuration) {
        
        int forward = solve(landStartTime, 
                            landDuration, 
                            waterStartTime, 
                            waterDuration
                        );

        int backward = solve(waterStartTime, 
                            waterDuration, 
                            landStartTime, 
                            landDuration
                        );

        return Math.min(forward, backward);
    }

    int solve(int[] s1, int[] d1, int[] s2, int[] d2) {

        int f1 = Integer.MAX_VALUE;
        for(int i = 0; i < s1.length; i++)
            f1 = Math.min(f1, s1[i] + d1[i]);
        
        int f2 = Integer.MAX_VALUE;
        for(int i = 0; i < s2.length; i++) 
            f2 = Math.min(f2, Math.max(s2[i], f1) + d2[i]);
        
        return f2;
    }
}
