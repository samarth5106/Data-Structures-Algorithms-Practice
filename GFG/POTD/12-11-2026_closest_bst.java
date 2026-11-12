/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    static int minDiff(Node root, int k) {
        int minDifference = Integer.MAX_VALUE;
        Node current = root;

        while (current != null) {
            minDifference = Math.min(minDifference, Math.abs(current.data - k));

            if (k < current.data) {
                current = current.left;
            } else if (k > current.data) {
                current = current.right;
            } else {
                return 0;
            }
        }

        return minDifference;
    }
}
