class Solution {
public:
    string chooseSwap(string &s) {
        set<char> unique_chars;
        for (char c : s) {
            unique_chars.insert(c);
        }

        for (int i = 0; i < s.length(); i++) {
            unique_chars.erase(s[i]);

            if (unique_chars.empty()) break;

            char smallest_remaining = *unique_chars.begin();

            if (smallest_remaining < s[i]) {
                char char1 = s[i];
                char char2 = smallest_remaining;

                for (int j = 0; j < s.length(); j++) {
                    if (s[j] == char1) {
                        s[j] = char2;
                    } else if (s[j] == char2) {
                        s[j] = char1;
                    }
                }
                break;
            }
        }
        return s;
    }
};
