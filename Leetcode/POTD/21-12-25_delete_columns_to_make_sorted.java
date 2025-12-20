class Solution {
    public int minDeletionSize(String[] strs) {
        int bck=0;
        int tochk=0;
        int curnt=0;
        int i=0;
        int todel=0;
        if(strs.length==1)
        return 0;
        String s=strs[0];
        String sinner="";
        int till=strs[i].length();
        while(till-->0){
            
            bck=s.charAt(tochk);
            for( i=1;i<strs.length;i++){
                sinner=strs[i];
                curnt=sinner.charAt(tochk);
                if(bck>curnt){
                    todel++;break;
                }
                else{
                    bck=curnt;
                }
            }       
            i=0;tochk++;
        }
        return todel;
    }
}
