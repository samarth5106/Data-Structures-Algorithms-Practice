import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t--> 0) {
            int n;
            n = sc.nextInt();
            ArrayList < Integer > arr = new ArrayList < > ();
            int flg1=0,zro=0,flg2=0;
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
                if(arr.get(i)!=0&&flg1==0){
                    flg1=1;
                }
                if(arr.get(i)==0&&flg1==1){
                    zro=1;
                }
                if(arr.get(i)!=0&&flg1==1&&zro==1){
                    flg2=1;
                }
            }
if(flg1+zro+flg2==3){
    System.out.println('2');
}
else if(flg1+zro+flg2==2||flg1+zro+flg2==1){
 System.out.println('1');   
}
else{
    System.out.println('0');
}

        }
    }
}
