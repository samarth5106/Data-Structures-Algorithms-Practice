class Solution{
public:
    long long tot=0,ans=0;
    const int MOD=1e9+7;

    long long dfs(TreeNode* r){
        if(!r) return 0;
        long long s=r->val+dfs(r->left)+dfs(r->right);
        ans=max(ans,s*(tot-s));
        return s;
    }

    int maxProduct(TreeNode* root){
        tot=dfs(root);
        ans=0;
        dfs(root);
        return ans%MOD;
    }
};
