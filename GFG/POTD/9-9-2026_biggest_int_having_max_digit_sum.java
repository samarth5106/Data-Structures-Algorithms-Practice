class Solution {
    public int findMax(int n) {
        String s = String.valueOf(n);
        int len = s.length();

        int bestNum = n;
        int bestSum = digitSum(n);

        char[] digits = s.toCharArray();

        for (int i = 0; i < len; i++) {
            if (digits[i] == '0') continue; // 0 ko 1 kam nahi kar sakte (leading/invalid issue)

            char[] candidate = digits.clone();
            candidate[i] = (char) (candidate[i] - 1);
            for (int j = i + 1; j < len; j++) {
                candidate[j] = '9';
            }

            // leading zero check (agar i==0 aur candidate[0] ban gaya '0')
            String candStr = new String(candidate);
          //  if (candStr.charAt(0) == '0') continue; // ya specially handle karo (len-1 digit number ban jaayega)

            int candNum = Integer.parseInt(candStr);
            int candSum = digitSum(candNum);

            if (candSum > bestSum || (candSum == bestSum && candNum > bestNum)) {
                bestSum = candSum;
                bestNum = candNum;
            }
        }

        return bestNum;
    }

    private int digitSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
