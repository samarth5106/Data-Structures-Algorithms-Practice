class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0); // overall score tracker

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                st.push(0);
            } else {
                int inner = st.pop();
                int val = (inner == 0) ? 1 : 2 * inner;
                // pichli depth ke score me add karo
                st.push(st.pop() + val);
            }
        }

        return st.pop();
    }
}
