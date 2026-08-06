class Solution {
    public int countMinOperations(int[] arr) {
        int totalIncrements = 0;
        int maxDoubles = 0;

        for (int num : arr) {
            int currentDoubles = 0;
            
            while (num > 0) {
                // If the lowest bit is set, we need an increment operation
                if ((num & 1) == 1) {
                    totalIncrements++;
                }
                
                num >>= 1; // Divide by 2
                
                if (num > 0) {
                    currentDoubles++;
                }
            }
            
            // Track the maximum doubling operations required by any single element
            maxDoubles = Math.max(maxDoubles, currentDoubles);
        }

        return totalIncrements + maxDoubles;
    }
}
