class Solution {
  public:
    vector<int> diagView(vector<vector<int>> mat) {
        // code here
        int row=0;
       // int i,j;
        int r,c;
        vector<int> ans;
        for(int i=0;i<mat.size();i++){
            c=i;
            r=row;
            while(c>=0){
                ans.push_back(mat[r][c]);
                c--;
                r++;
            }
            
        }
        int col=mat.size()-1;
        for(int j=1;j<mat.size();j++){
            r=j;
            c=col;
            while(r<mat.size()){
                ans.push_back(mat[r][c]);
                r++;
                c--;
            }
        }
        return ans;
        
    }
};
