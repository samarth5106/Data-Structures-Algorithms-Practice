class Solution {

    int maxLen = 0;

    void solve(int i, StringBuilder str, int count, HashSet<String> ans, String s) {

        if (count < 0) {
            return;
        }

        if (i == s.length()) {

            if (count == 0) {

                if (str.length() > maxLen) {
                    maxLen = str.length();
                    ans.clear();
                    ans.add(str.toString());
                }
                else if (str.length() == maxLen) {
                    ans.add(str.toString());
                }
            }

            return;
        }

        char c = s.charAt(i);

        int val = 0;

        if (c == '(') {
            val = 1;
        }
        else if (c == ')') {
            val = -1;
        }

        // Take
        str.append(c);
        solve(i + 1, str, count + val, ans, s);
        str.deleteCharAt(str.length() - 1);

        // Don't take
        solve(i + 1, str, count, ans, s);
    }

    public List<String> removeInvalidParentheses(String s) {

        HashSet<String> ans = new HashSet<>();

        solve(0, new StringBuilder(), 0, ans, s);

        return new ArrayList<>(ans);
    }
}
