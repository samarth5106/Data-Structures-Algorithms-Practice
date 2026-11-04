class Solution {

    int solve(int i,String s,int num,int[] dp){

        if((num>26)){
            return 0;
        }

        if(i!=0){
            if(num==0) return 0;
        }
        
        if(i>=s.length()) return 1;

        if(dp[i]!=-1) return dp[i];

        int Odigit=Character.getNumericValue(s.charAt(i));

        int Sdig=0;

        if(i+1<s.length()){
            Sdig=Integer.parseInt(s.substring(i,i+2));
        }
        int first=Sdig/10;
        if(first==0) Sdig=0;

        int onedig=solve(i+1,s,Odigit,dp);
       
        int twodig=0;
        if(Sdig!=0){
            twodig=solve(i+2,s,Sdig,dp);
        }

        return dp[i]=onedig+twodig;

    }

    public int numDecodings(String s) {
        //that number must be >=1 && <=26
        //1st digit not be 0

        //StringBuilder sb=new StringBuilder();
        int[] dp=new int[s.length()];

            Arrays.fill(dp,-1);
        
        int ways=solve(0,s,0,dp);

        if(ways<0) return 0;

        return ways;

    }
}
