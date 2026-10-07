/* Node Structure
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */

class Solution {

    int ans;

    int solve(Node root) {

        if (root == null) {
            return Integer.MIN_VALUE;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            return root.data;
        }

        int left = solve(root.left);
        int right = solve(root.right);

        // Both sides contain a leaf
        if (left != Integer.MIN_VALUE && right != Integer.MIN_VALUE) {
            ans = Math.max(ans, left + root.data + right);
        }

        // Return the best path from this node to a leaf
        if (left == Integer.MIN_VALUE) {
            return root.data + right;
        }

        if (right == Integer.MIN_VALUE) {
            return root.data + left;
        }

        return root.data + Math.max(left, right);
    }

    public int maxPathSum(Node root) {

        ans = Integer.MIN_VALUE;

        solve(root);

        if (ans == Integer.MIN_VALUE) {
            return -1;
        }

        return ans;
    }
}
