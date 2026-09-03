class Solution {
    public boolean uniformArray(int[] nums1) {
        //so j vla apnko nums[i] se chota hona 
        //odd - odd = even
       
        //even - odd = odd

        // if all odd only 1 even and that even is smallest
        // mai usko odd nhi bna skta 

        //all odd or all even = true
        //if single even all odd then 
        // -> even vla smallest nhi hona chahiye if its is smallest then we cant make it odd 
        // -> we will need to make all odds into even so jo smallest odd hai usko even nhi kr skte as it requires smaller odd to be even

        // //if single odd all even then
        // -> i cant convert that odd to even 
        // -> all odd- then odd smallest rhna chahiye else return false

        // //mixed 
        // -> making even - then jo smallest odd h usko nhi kr skte
        // -> make odd - to ek odd aisa hona jo sabhi even me se smallest ho 

        int odd=0;
        int miniodd=Integer.MAX_VALUE;
        //int maxodd=0;

        int even =0;
        int minieven=Integer.MAX_VALUE;
       // int maxeven=0;

        for(int i=0;i<nums1.length;i++){
            if((nums1[i]&1)==1){
                odd++;
                miniodd=Math.min(miniodd,nums1[i]);
                //maxodd=Math.max(maxodd,nums1[i]);
            }
            else {even++;
            minieven=Math.min(minieven,nums1[i]);}
           // maxeven=Math.min(maxeven,nums1[i]);
        }

        if(odd==0||even==0) return true;
         if(minieven>miniodd) return true;
        return false;
    }
}
