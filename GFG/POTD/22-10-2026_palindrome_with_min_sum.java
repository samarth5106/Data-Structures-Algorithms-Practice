class Solution {
    public static int minimumSum(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

    
        for (int i = 0; i < n / 2; i++) {
            int j = n - 1 - i;
            if (arr[i] != '?' && arr[j] != '?') {
                if (arr[i] != arr[j]) return -1;
            } else if (arr[i] != '?') {
                arr[j] = arr[i];
            } else if (arr[j] != '?') {
                arr[i] = arr[j];
            }
        }

        int sum = 0;
        char prev = '?';
        for (int i = 0; i < n; i++) {
            if (arr[i] != '?') {
                if (prev != '?') {
                    sum += Math.abs(arr[i] - prev);
                }
                prev = arr[i];
            }
        }

        return sum;
    }
}
