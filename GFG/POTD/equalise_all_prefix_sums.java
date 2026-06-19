import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> optimalArray(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        ans.add(0);
        int currentOperations = 0;
        
        for (int i = 1; i < arr.length; i++) {
            currentOperations += (arr[i] - arr[i / 2]);
            ans.add(currentOperations);
        }
        
        return ans;
    }
}
