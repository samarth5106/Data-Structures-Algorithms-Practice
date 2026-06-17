class Solution {
    public int candy(int[] ratings) {
        if(ratings.length==1) return 1;
        int cnt=ratings.length;
        
        int prev=ratings[0];
        int[] candies=new int[ratings.length];
        Arrays.fill(candies,1);
        boolean change=true;
        while(change){
            change=false;
            for(int i=0;i<ratings.length;i++){
            if(i==0){
                if(ratings[i+1]<ratings[i]&&candies[i+1]>=candies[i]){
                    cnt++;
                    candies[i]++;
                    change=true;
                } 
            }
            else if(i==ratings.length-1){
                if(ratings[i-1]<ratings[i]&&candies[i-1]>=candies[i]){
                    cnt++;
                    candies[i]++;
                    change=true;
                } 
            }
            else{
                if((ratings[i-1]<ratings[i]&&candies[i-1]>=candies[i])||(ratings[i+1]<ratings[i]&&candies[i+1]>=candies[i])){
                    cnt++;
                    candies[i]++;
                    change=true;
                }
            }
          }
        }
        
        return cnt;
    }
}
