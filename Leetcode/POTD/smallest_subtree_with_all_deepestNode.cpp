class Solution {
public:
    TreeNode* subtreeWithAllDeepest(TreeNode* root) {
        return dfs(root).first;
    }
    
private:
    pair<TreeNode*, int> dfs(TreeNode* node) {
        if (!node) {
            return {nullptr, 0};
        }
        auto left = dfs(node->left);
        auto right = dfs(node->right);
        int leftDepth = left.second;
        int rightDepth = right.second;
        if (leftDepth == rightDepth) {
            return {node, leftDepth + 1};
        } else if (leftDepth > rightDepth) {
            return {left.first, leftDepth + 1};
        } else {
            return {right.first, rightDepth + 1};
        }
    }
};
