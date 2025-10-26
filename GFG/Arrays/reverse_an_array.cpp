class Solution {
  public:
    void reverseArray(vector<int> &arr) {
        // code here
        int i=0,j=arr.size()-1;
        while(j>i){
            swap(arr[i],arr[j]);
            i++;j--;
        }
        return;
    }
};
