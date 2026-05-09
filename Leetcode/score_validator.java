class Solution {
    public int[] scoreValidator(String[] events) {
     int[] ans=new int[2];
        int score=0,cnt=0;
        for(int i=0;i<events.length;i++){
            String s=events[i];
            if(cnt==10){
                break;
            }
            if(s.equals("1")||s.equals("WD")||s.equals("NB")){
                score++;
            }
            else if(s.equals("2")){
                score+=2;
            }
            else if(s.equals("3")){
                score+=3;
            }
            else if(s.equals("4")){
                score+=4;
            }
            else if(s.equals("6")){
                score+=6;
            }
            else if(s.equals("W")){
               // score+=2;
                cnt++;
            }
        }
        ans[0]=score;
        ans[1]=cnt;
        return ans;
    }
}
