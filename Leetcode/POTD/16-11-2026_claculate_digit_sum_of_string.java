class Solution {
    String solve(String s,int k){
         StringBuilder ans=new StringBuilder();
         int i=0;
        while(i<s.length()){
        if(s.length()-i<k){
            break;
        }
        String sub=s.substring(i,i+k);

        int sum=0;

        for(char x:sub.toCharArray()){
            sum+=x-'0';
         }
            ans.append((sum+""));
            i+=k;

        }
        int sum=0;
        if(i!=s.length()){
 while(i<s.length()){
            sum+=(s.charAt(i)-'0');
            i++;
        }
        ans.append(sum+"");
        }
       
        return ans.toString();
       
    }
    public String digitSum(String s, int k) {
    
     int n=s.length();
     String pass=s;

     if(s.length()<=k) return s;
    // int i=0;
    String a="";
     while(n>k){
       a=solve(pass,k);
        n=a.length();
        pass=a;
     }
     return a;

    }
}
