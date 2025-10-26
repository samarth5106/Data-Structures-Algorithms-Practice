class Solution {
  public:
    int getSecondLargest(vector<int> &arr) {
        // code here
        int second_max=-1;
        int maxi=-1;
        for(int i=0;i<arr.size();i++){
            if(arr[i]>maxi){
                second_max=maxi;
                maxi=arr[i];
            }
            else if(arr[i]>second_max&&arr[i]!=maxi){
                second_max=arr[i];
            }
        }
        return second_max;
    }
};
