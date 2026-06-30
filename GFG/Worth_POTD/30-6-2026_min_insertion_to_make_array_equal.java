import java.util.*;

class Solution {
    // Binary Search to find LIS in O(N log N)
    private int getLIS(List<Integer> list) {
        if (list.isEmpty()) return 0;
        
        List<Integer> tails = new ArrayList<>();
        for (int num : list) {
            int idx = Collections.binarySearch(tails, num);
            if (idx < 0) {
                idx = -(idx + 1);
            }
            if (idx == tails.size()) {
                tails.add(num);
            } else {
                tails.set(idx, num);
            }
        }
        return tails.size();
    }

    public int minInsAndDel(int[] a, int[] b) {
        // Step 1: Array B ke elements ke index ko map karo
        Map<Integer, Integer> mapB = new HashMap<>();
        for (int j = 0; j < b.length; j++) {
            mapB.put(b[j], j);
        }

        // Step 2: Array A ko B ke indices ke term mein convert karo
        List<Integer> transformedA = new ArrayList<>();
        for (int num : a) {
            if (mapB.containsKey(num)) {
                transformedA.add(mapB.get(num));
            }
        }

        // Step 3: Transformed array ka LIS nikal lo
        int lis = getLIS(transformedA);

        // Step 4: Final output formula
        int deletions = a.length - lis;
        int insertions = b.length - lis;

        return deletions + insertions;
    }
}
