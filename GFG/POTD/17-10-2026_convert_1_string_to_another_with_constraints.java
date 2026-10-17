class Solution {
    public boolean isItPossible(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        
        if (n != m) return false;
        
        int i = 0, j = 0;
        
        while (i < n || j < m) {
            while (i < n && s1.charAt(i) == '#') {
                i++;
            }
            while (j < m && s2.charAt(j) == '#') {
                j++;
            }
            
            if (i == n && j == m) {
                return true;
            }
            if (i == n || j == m) {
                return false;
            }
            
            if (s1.charAt(i) != s2.charAt(j)) {
                return false;
            }
            
            if (s1.charAt(i) == 'A' && i < j) {
                return false;
            }
            if (s1.charAt(i) == 'B' && i > j) {
                return false;
            }
            
            i++;
            j++;
        }
        
        return true;
    }
}
