class Solution {
    public int[] divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);

                if (i != n / i) {  
                    list.add(n / i);
                }
            }
        }
Collections.sort(list);
       
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

return ans;
    }
}
