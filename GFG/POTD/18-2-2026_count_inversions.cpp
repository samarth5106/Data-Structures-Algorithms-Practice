class Solution {
  public:
    int merge(vector<int>& arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        vector<int> left(n1), right(n2);
        
        for(int i = 0; i < n1; i++){
            left[i] = arr[l + i];
        }
        for(int i = 0; i < n2; i++){
            right[i] = arr[m + 1 + i];
        }
        
        int i = 0, j = 0, k = l, count = 0;
        
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
                count += (n1 - i);
            }
        }
        
        while(i < n1){
            arr[k++] = left[i++];
        }
        while(j < n2){
            arr[k++] = right[j++];
        }
        
        return count;
    }
    
    int mergeSort(vector<int>& arr, int l, int r){
        int count = 0;
        if(l < r){
            int m = l + (r - l) / 2;
            count += mergeSort(arr, l, m);
            count += mergeSort(arr, m + 1, r);
            count += merge(arr, l, m, r);
        }
        return count;
    }
    
    int inversionCount(vector<int> &arr) {
        return mergeSort(arr, 0, arr.size() - 1);
    }
};
