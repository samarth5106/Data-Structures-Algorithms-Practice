class Solution {
    public boolean findPattern(String s) {
        // code here
        Stack<Character> st=new Stack<>();
        
        for(char c:s.toCharArray()){
            if(c=='x')st.push(c);
            
            else{
                if(st.isEmpty()) st.push(c);
                else if(st.peek()=='x') st.pop();
                
            }
        }
        
        return st.isEmpty();
    }
}
