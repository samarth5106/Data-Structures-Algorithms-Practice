import java.util.*;


public class Main
{
    
    
    public static boolean check(int val,int[] arr,int a){
       
        int rem=a-1;
        int stdused=1;
        int currentpage=0;
        int i=0;
        while(i<arr.length){
            if(currentpage+arr[i]<=val){
                currentpage+=arr[i];
            }
            else{
                stdused++;
                currentpage=arr[i];
            }
            i++;
        }
        return stdused<=a;
        
        
        
    }
    
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int t;
       t=sc.nextInt();
       while(t-->0)
       {
          int n;
          n=sc.nextInt();
          int a;
          a=sc.nextInt();
          int maxi=0;
          int[] b=new int[n];
          int sum=0;
          for(int i=0;i<n;i++){
              b[i]=sc.nextInt();
              maxi=Math.max(maxi,b[i]);
              sum+=b[i];
          }
          
        //lowest a student can get =max(b);
        //maximum = sum(b);
        
          
          int l=maxi;
          int h=sum;
          int ans=Integer.MAX_VALUE;
          while(l<=h){
              int mid=(l+h)/2;
              if(check(mid,b,a)){
                  ans=Math.min(ans,mid);
                  h=mid-1;
              }
              else{
                  l=mid+1;
              }
          }
          System.out.println(ans);
          
       }
       

    }
}
