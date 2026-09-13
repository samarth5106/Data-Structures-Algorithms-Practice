class Solution {
    int count(int[][] img1,int[][] img2,int rowoffset,int coloffset){
        int cnt=0;
        int n=img1.length;
        for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                if(i+rowoffset>=0&&i+rowoffset<n&&j+coloffset>=0&&j+coloffset<n){
                    if(img2[i][j]==1&&img1[i+rowoffset][j+coloffset]==1) cnt++; 
                }
                      
            }
        }
        return cnt;

    }
    
    public int largestOverlap(int[][] img1, int[][] img2) {
        int maxi=0;
        int n=img1.length;

        for(int rowoffset=(-1*n)+1;rowoffset<n;rowoffset++){
            for(int coloffset=(-1*n)+1;coloffset<n;coloffset++){
                
                 maxi=Math.max(maxi,count(img1,img2,rowoffset,coloffset));
                

            }
        }
        return maxi;
    }
}
