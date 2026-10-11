class Solution {
    public boolean balancePan(int a, int b) {
        long currentB = b;

        while (currentB > 0) {
            long rem = currentB % a;

            if (rem == 0) {
                currentB /= a;
            } else if (rem == 1) {
                currentB = (currentB - 1) / a;
            } else if (rem == a - 1) {
                currentB = (currentB + 1) / a;
            } else {
                return false;
            }
        }

        return true;
    }
}
