class Solution {
    public boolean wifiRange(String s, int x) {
        int n = s.length();
        int sum = 0;
        int r = Math.min(x, n - 1);
        for (int i = 0; i <= r; i++) {
            sum += s.charAt(i) - '0';
        }
        if (s.charAt(0) == '0' && sum == 0) return false;
        int l = 0;
        for (int i = 1; i < n; i++) {
            if (i + x < n) {
                r++;
                sum += s.charAt(r) - '0';
            }
            if (i - x - 1 >= 0) {
                sum -= s.charAt(l) - '0';
                l++;
            }
            if (s.charAt(i) == '0' && sum == 0) return false;
        }
        return true;
    }
}
