import java.util.ArrayList;
import java.util.List;

class Solution {
    boolean isit(String s, List<String> wd) {
        for (int i = 0; i < wd.size(); i++) {
            if (wd.get(i).equals(s)) return true;
        }
        return false;
    }

    void solve(int I, String s, List<String> wd, List<String> ans, String currentSentence) {
        if (I == s.length()) {
            ans.add(currentSentence);
            return;
        }

        for (int i = I; i < s.length(); i++) {
            String sub = s.substring(I, i + 1); 

            if (isit(sub, wd)) {
                String nextSentence;
                if (currentSentence.isEmpty()) {
                    nextSentence = sub; 
                } else {
                    nextSentence = currentSentence + " " + sub; 
                }
                solve(i + 1, s, wd, ans, nextSentence);
            }
        }
    }

    public List<String> wordBreak(String s, List<String> wd) {
        List<String> ans = new ArrayList<>();
        solve(0, s, wd, ans, ""); 
        return ans;
    }
}
