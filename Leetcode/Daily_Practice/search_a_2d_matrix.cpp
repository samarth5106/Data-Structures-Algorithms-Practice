class Solution {
public:
    bool searchMatrix(vector<vector<int>>& mat, int target) {
        //flattening and then applying BS- tc=o(m*n) sc=o(m*n)
        // aplyin BS in each row,,,tc=m*log(m*n)
        int n=mat[0].size();// column size
        int m=mat.size();// numbers of rows
      
       int l=0,h=m*n-1;
       while(l<=h){
        int mid=(l+h)/2;
        if(mat[mid/n][mid%n]==target){
            return true;
        }
        else if(mat[mid/n][mid%n]<target){
            l=mid+1;
        }
        else h=mid-1;
       }

       

        return false;
        
    }
};
