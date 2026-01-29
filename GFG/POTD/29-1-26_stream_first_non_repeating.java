class Solution {
    public String firstNonRepeating(String s) {
        // code here
        int[] freq=new int[26];
        Queue<Character> q=new LinkedList<>();
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
            q.add(c);

            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.poll();
            }

            if(q.isEmpty())ans.append('#');
            else ans.append(q.peek());
        }
        return ans.toString();
    }
}
