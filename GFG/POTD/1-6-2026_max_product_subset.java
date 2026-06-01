import java.util.*;

class Solution {
    public int findMaxProduct(int[] arr) {
        if(arr.length==1) return arr[0];
        long mod=1000000007L;
        int neg=0;
        int zeroCount=0;
        int mini=Integer.MIN_VALUE;
        for(int num:arr) {
            if(num<0) {
                neg++;
                mini=Math.max(num,mini);
            }
            if(num==0) {
                zeroCount++;
            }
        }
        if(zeroCount==arr.length) return 0;
        if(neg==1&&zeroCount+neg==arr.length) return 0;
        
        long ans=1;
        boolean done=false;
        if(neg%2!=0) {
            for(int num:arr) {
                if(num==0) continue;
                if(num==mini&&!done) {
                    done=true;
                    continue;
                }
                long val=num;
                if(val<0) val=(val+mod)%mod;
                ans=(ans*val)%mod;
            }
        } else {
            for(int num:arr) {
                if(num!=0) {
                    long val=num;
                    if(val<0) val=(val+mod)%mod;
                    ans=(ans*val)%mod;
                }
            }
        }
        return (int)ans;
    }
}
