class Solution {
    public String lexicographicallySmallest(String s,int k) {

        int n=s.length();

        if((n&(n-1))==0){
            k/=2;
        }
        else{
            k*=2;
        }

        if(k>=n) return "-1";

        Stack<Character> st=new Stack<>();

        for(int i=0;i<n;i++){

            while(!st.isEmpty()&&k>0&&st.peek()>s.charAt(i)){
                st.pop();
                k--;
            }

            st.push(s.charAt(i));
        }

        while(k>0){
            st.pop();
            k--;
        }

        StringBuilder ans=new StringBuilder();

        for(char ch:st){
            ans.append(ch);
        }

        return ans.toString();
    }
}
