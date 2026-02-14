import java.util.*;


public class Main
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int t;
       t=sc.nextInt();
       while(t-->0)
       {
          String s;
          s=sc.next();
          int alice=1;
          int bob=0;
          //1 mean its turn is now
          // 0 means his/her turn is not now
          
          Stack<Character> st=new Stack<>();
          for(int i=0;i<s.length();i++){
              if(i==0){
                  st.push(s.charAt(i));
                  continue;
              }
              if(!st.isEmpty()&&st.peek()!=s.charAt(i)){
                  st.pop();
                  if(alice==1)
                  {
                      alice=0;bob=1;
                  }
                  else{
                      alice=1;bob=0;
                  }
                  continue;
              }
              st.push(s.charAt(i));
              
          }
          if(alice==1)
          System.out.println("NET");
          else
          System.out.println("DA");
          
       }
       

    }
}
