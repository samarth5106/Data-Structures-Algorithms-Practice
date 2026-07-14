class Solution {

    int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }


    public int subsequencePairCount(int[] nums) {
       // int[][][] dp=new int[nums.length+1][201][201];
        int[][] ahead=new int[201][201];
        int[][] current=new int[201][201];

        for(int i=1;i<201;i++){
            ahead[i][i]=1;
        }
        int[][] g = new int[201][201];

for(int i=0;i<=200;i++){
    for(int j=0;j<=200;j++){
        g[i][j]=gcd(i,j);
    }
}
        

        for(int i=nums.length-1;i>=0;i--){
            
            for(int j=0;j<201;j++){
                for(int k=0;k<201;k++){
                    int skip=ahead[j][k];
                    int take1=ahead[g[nums[i]][j]][k];
                    int take2=ahead[j][g[nums[i]][k]];
                    long ans=(long)skip+take1+take2;
                    current[j][k]=(int)((ans)%((int)1e9+7));

                }
            }int[][] temp = ahead;
ahead = current;
current = temp;
        }
    
        return ahead[0][0];
        
    }
}
