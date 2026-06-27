class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        ArrayDeque<TreeNode> nodeStack = new ArrayDeque<>();
        ArrayDeque<Integer> sumStack = new ArrayDeque<>();

        nodeStack.push(root);
        sumStack.push(targetSum - root.val);

        while (!nodeStack.isEmpty()) {

            TreeNode current = nodeStack.pop();
            int remaining = sumStack.pop();

            if (current.left == null && current.right == null && remaining == 0) {
                return true;
            }

            if (current.right != null) {
                nodeStack.push(current.right);
                sumStack.push(remaining - current.right.val);
            }

            if (current.left != null) {
                nodeStack.push(current.left);
                sumStack.push(remaining - current.left.val);
            }
        }

        return false;
        
    }
