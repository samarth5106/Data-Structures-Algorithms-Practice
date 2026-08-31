import java.util.*;

class Solution {
    public int minCost(int n, int i, int d, int c) {
        int maxLen = 2 * n;
        int[] dist = new int[maxLen + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = i;

        long[] heap = new long[3 * (maxLen + 1) + 10]; // har node max 3 baar push ho sakta hai
        int heapSize = 0;
        heap[heapSize++] = encode(dist[1], 1);

        while (heapSize > 0) {
            long top = heap[0];
            heapSize--;
            heap[0] = heap[heapSize];
            siftDown(heap, 0, heapSize);

            int cost = (int) (top >> 21);
            int len = (int) (top & 0x1FFFFF);

            if (cost > dist[len]) continue; // stale entry
            if (len == n) return cost;

            if (len + 1 <= maxLen && cost + i < dist[len + 1]) {
                dist[len + 1] = cost + i;
                heap[heapSize] = encode(dist[len + 1], len + 1);
                siftUp(heap, heapSize++);
            }
            if (len - 1 >= 0 && cost + d < dist[len - 1]) {
                dist[len - 1] = cost + d;
                heap[heapSize] = encode(dist[len - 1], len - 1);
                siftUp(heap, heapSize++);
            }
            if (len * 2 <= maxLen && cost + c < dist[len * 2]) {
                dist[len * 2] = cost + c;
                heap[heapSize] = encode(dist[len * 2], len * 2);
                siftUp(heap, heapSize++);
            }
        }
        return dist[n];
    }

    private long encode(int cost, int len) {
        return ((long) cost << 21) | len; // len <= 2*10^6 fits in 21 bits
    }

    private void siftUp(long[] heap, int idx) {
        while (idx > 0) {
            int parent = (idx - 1) / 2;
            if (heap[parent] <= heap[idx]) break;
            long tmp = heap[parent]; heap[parent] = heap[idx]; heap[idx] = tmp;
            idx = parent;
        }
    }

    private void siftDown(long[] heap, int idx, int size) {
        while (true) {
            int left = 2 * idx + 1, right = 2 * idx + 2, smallest = idx;
            if (left < size && heap[left] < heap[smallest]) smallest = left;
            if (right < size && heap[right] < heap[smallest]) smallest = right;
            if (smallest == idx) break;
            long tmp = heap[smallest]; heap[smallest] = heap[idx]; heap[idx] = tmp;
            idx = smallest;
        }
    }
}
