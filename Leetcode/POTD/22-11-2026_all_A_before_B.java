class Solution {
    public boolean checkString(String s) {
        // Stack<Character> st=new Sdtack<>();
        // for(int i=0;i<s.length();i++){

        // }
        boolean a=false;
        boolean b=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'&&b==false){
                a=true;
                continue;
            }
            else if(s.charAt(i)=='a'&&b==true){
                return false;
            }
            if(s.charAt(i)=='b') b=true;
        }
        return true;
    }
}
