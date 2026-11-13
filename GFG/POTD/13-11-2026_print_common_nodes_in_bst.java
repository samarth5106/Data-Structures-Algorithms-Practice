class Solution {
    public ArrayList<Integer> findCommon(Node r1, Node r2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        // Step 1: Store all elements of the first BST in a HashSet
        storeNodes(r1, set);
        
        // Step 2: Traverse the second BST in-order (sorted) 
        // and add elements that exist in the set
        findIntersection(r2, set, result);
        
        return result;
    }
    
    // Helper function to traverse r1 and populate the set
    private void storeNodes(Node root, HashSet<Integer> set) {
        if (root == null) return;
        
        storeNodes(root.left, set);
        set.add(root.data);
        storeNodes(root.right, set);
    }
    
    // Helper function to traverse r2 in sorted order and check matches
    private void findIntersection(Node root, HashSet<Integer> set, ArrayList<Integer> result) {
        if (root == null) return;
        
        // Left -> Root -> Right ensures the result list is automatically sorted
        findIntersection(root.left, set, result);
        
        if (set.contains(root.data)) {
            result.add(root.data);
        }
        
        findIntersection(root.right, set, result);
    }
}
