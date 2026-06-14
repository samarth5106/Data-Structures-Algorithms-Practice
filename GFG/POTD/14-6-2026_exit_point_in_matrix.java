class Solution {
    public List<Integer> exitPoint(int[][] mat) {

        boolean left=false;
        boolean right=true;
        boolean down=false;
        boolean up=false;

        int i=1;
        int j=1;

        ArrayList<Integer> ans=new ArrayList<>();

        while(true){

            if(i==0||i>mat.length||j==0||j>mat[0].length){

                if(i==0) i=1;
                else if(i>mat.length) i=mat.length;

                if(j==0) j=1;
                else if(j>mat[0].length) j=mat[0].length;

                ans.add(i-1);
                ans.add(j-1);

                return ans;
            }

            int val=mat[i-1][j-1];

            if(val==0){

                if(right) j++;
                else if(left) j--;
                else if(down) i++;
                else i--;

            }
            else{

                mat[i-1][j-1]=0;

                if(right){
                    right=false;
                    down=true;
                    i++;
                }
                else if(down){
                    down=false;
                    left=true;
                    j--;
                }
                else if(left){
                    left=false;
                    up=true;
                    i--;
                }
                else{
                    up=false;
                    right=true;
                    j++;
                }
            }
        }
    }
}
