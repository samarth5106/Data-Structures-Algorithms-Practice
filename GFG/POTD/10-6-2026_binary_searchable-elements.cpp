class Solution {
  public:
    int binarySearch(const std::vector<int>& arr, int target) {
        int low = 0;
        int high = arr.size() - 1;

        while (low <= high) {
       
            int mid = low + (high - low) / 2; 

            if (arr[mid] == target) {
            return 1; 
        }
        else if (arr[mid] < target) {
            low = mid + 1; 
        }
        else {
            high = mid - 1; 
        }
    }
        return 0;
    }

    int binarySearchable(vector<int>& arr) {
       int n = arr.size();
       
       int cnt = 0;
       for(int I = 0; I < n; I++){
           if(binarySearch(arr,  arr[I])) cnt++;
       }
    
     return cnt;
    }
};
