import java.util.PriorityQueue;

class Solution {
    public static int minComputation(int[] files) {
        if (files == null || files.length <= 1) {
            return 0;
        }

        // Min-heap to keep track of the smallest files
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int file : files) {
            pq.add(file);
        }

        int totalCost = 0;

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            int currentCost = first + second;
            totalCost += currentCost;

            pq.add(currentCost);
        }

        return totalCost;
    }
}
