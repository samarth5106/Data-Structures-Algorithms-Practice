class Solution {
public:
    long long maxMatrixSum(vector<vector<int>>& matrix) {
        int sumpos=0;
        int sumneg=0;
        int cnt=0;
        int maxi=INT_MIN;
        int posmini=INT_MAX;
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix[i].size();j++){
                if(matrix[i][j]<0){
                    cnt++;
                    sumneg+=matrix[i][j];
                    maxi=max(maxi,matrix[i][j]);
                }
                else{
                    posmini=min(posmini,matrix[i][j]);
                    sumpos+=matrix[i][j];
                }
            }
        }
       sumneg*=-1;
            sumpos+=sumneg;
            maxi*=-1;
        int endmini=min(posmini,maxi);
        if(cnt%2!=0){
            sumpos-=endmini;
        }
        return sumpos;
    }
};
