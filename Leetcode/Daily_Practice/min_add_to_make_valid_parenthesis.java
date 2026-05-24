class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> stk=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(stk.isEmpty()){
                stk.push(s.charAt(i));
            }
            else{
                if(stk.peek()=='('&&s.charAt(i)==')'){
                    stk.pop();
                }
                else{
                    stk.push(s.charAt(i));
                }
            }
        }
        return stk.size();
    }
}
