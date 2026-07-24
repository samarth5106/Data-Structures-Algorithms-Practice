class Solution {
  private:
    int maxPath = 0;

    void dfs(Node* node, int expectedVal, int currentLength) {
        if (!node) return;

        // Check if current node continues the consecutive sequence
        if (node->data == expectedVal) {
            currentLength++;
        } else {
            // Reset sequence length if property breaks
            currentLength = 1;
        }

        // Update the maximum path length found so far
        maxPath = max(maxPath, currentLength);

        // Recurse down to left and right children expecting data + 1
        dfs(node->left, node->data + 1, currentLength);
        dfs(node->right, node->data + 1, currentLength);
    }

  public:
    int longestConsecutive(Node* root) {
        if (!root) return -1;

        maxPath = 0;
        
        // Start DFS with an initial expected value equal to root's data 
        // to naturally set currentLength = 1 at the root.
        dfs(root, root->data, 0);

        // If no consecutive path with length > 1 exists, return -1
        return (maxPath > 1) ? maxPath : -1;
    }
};
