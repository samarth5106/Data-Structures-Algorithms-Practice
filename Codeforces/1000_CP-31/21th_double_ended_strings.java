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
          String a;
          String b;
          a=sc.next();
          b=sc.next();
          if(a.equals(b)){
              System.out.println('0');continue;
          }
         int i;
         int as=a.length();
         int bs=b.length();
         String s="";
        int opn=as+bs;
             for(i=0;i<b.length();i++){
                s="";
                s+=b.charAt(i);
                 if(a.contains(s)){
                        opn=Math.min(opn,(as+bs-(2*s.length())));
                    }
                 for(int j=i+1;j<b.length();j++){
                     s+=b.charAt(j);
                    if(a.contains(s)){
                        opn=Math.min(opn,(as+bs-(2*s.length())));
                    }
                 }
             }
            
         System.out.println(opn);
          
       }
       

    }
}
