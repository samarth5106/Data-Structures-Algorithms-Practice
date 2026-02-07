class Solution{
    public int minimumDeletions(String s){
        int totA=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')totA++;
        }
        int curB=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')totA--;
            ans=Math.min(ans,curB+totA);
            if(s.charAt(i)=='b')curB++;
        }
        return ans;
    }
}
Approach / Intuition:
Is problem me hume string ko aise banana hai ki koi bhi 'b' ke baad 'a' na aaye, matlab final string ka structure hamesha pehle sab 'a' aur baad me sab 'b' hoga. Iske liye hum string me ek boundary maan lete hain. Boundary ke left side me agar koi 'b' hai to use delete karna padega, aur boundary ke right side me agar koi 'a' hai to use delete karna padega. Pehle hum total 'a' count kar lete hain. Phir left se right iterate karte hue, har boundary par left side ke 'b' ka count aur right side ke 'a' ka count nikalte hain, aur in dono ka sum minimum lene ki koshish karte hain. Har possible boundary check karna zaroori hai kyunki best answer beech me bhi aa sakta hai.
My previous approach galat kyon thi:
Meri pehle wali approach me main sirf end wali boundaries consider kar raha tha (jaise first 'b' ke baad ya last 'a' se pehle), jabki actual minimum deletion string ke beech ki kisi boundary par bhi mil sakta hai. Isliye sirf ends check karna sufficient nahi tha.
