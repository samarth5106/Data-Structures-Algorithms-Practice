class Solution {
    private int minDiff = Integer.MAX_VALUE;
    private Node prev = null;

    int absDiff(Node root) {
        minDiff = Integer.MAX_VALUE;
        prev = null;
        inOrder(root);
        return minDiff;
    }

    private void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, root.data - prev.data);
        }
        prev = root;

        inOrder(root.right);
    }
}
