class Solution {
    public int findXOR(int l, int r) {
        // code here
       
        // numbers - r-l+1;
       
        // 0^0=0
        //0^1=1
       
        //1^1=0
        //1^0=1
       
       
        //r tak ke ka xor from 1,  ^ (1 se l-1 tak ke ka xor will be ans )
       
        //but 1 to r tak ka xor itself will be TLE
       
        // observation - repeating pattern of length 4
       
        int tillr=0;
       
        int val=r%4;
        if(val==0) tillr=r;
       
        else if(val==1) tillr=1;
       
        else if(val==2) tillr=r+1;
       
        int tilll=0;
       
        val =(l-1)%4;
       
        if(val==0)
        tilll=l-1;
       
        else if(val==1) tilll=1;
       
        else if(val==2) tilll=l;
       
        return tillr^tilll;
       
    }
}
