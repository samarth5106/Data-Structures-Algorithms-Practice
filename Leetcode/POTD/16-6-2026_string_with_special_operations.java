class Solution {
    public String processStr(String s) {
        String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97&&s.charAt(i)<=122){
                result+=s.charAt(i);
            }
            else if(s.charAt(i)=='*'&&result.length()!=0){
                result=result.substring(0,result.length()-1);
            }
            //.pop,.remove.slice.splice....
            else if(s.charAt(i)=='#'){
                result+=result;
            }
            else{
                String ans=new StringBuilder(result).reverse().toString();
                result=ans;
            }
        }
        return result;
        
    }
}
