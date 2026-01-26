import java.util.*;

class Solution{
    static void swap(int[] a,int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    static void go(int idx,int[] a,ArrayList<ArrayList<Integer>> res){
        if(idx==a.length){
            ArrayList<Integer> cur=new ArrayList<>();
            for(int x:a)cur.add(x);
            res.add(cur);
            return;
        }
        for(int i=idx;i<a.length;i++){
            swap(a,idx,i);
            go(idx+1,a,res);
            swap(a,idx,i);
        }
    }

    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr){
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        go(0,arr,res);
        return res;
    }
}
