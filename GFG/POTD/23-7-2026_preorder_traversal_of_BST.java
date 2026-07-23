class Solution {
    public boolean canRepresentBST(List<Integer> arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MIN_VALUE;

        for (int x : arr) {
            
            if (x < root) {
                return false;
            }

           
            while (!stack.isEmpty() && stack.peek() < x) {
                root = stack.pop();
            }

            stack.push(x);
        }

        return true;
    }
}
