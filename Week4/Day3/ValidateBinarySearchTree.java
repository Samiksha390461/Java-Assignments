class Solution {
    public boolean isValidBST(TreeNode root) {
        ArrayDeque<TreeNode> path = new ArrayDeque<>();
        TreeNode current = root;
        Long previousValue = null;

        while (current != null || !path.isEmpty()) {

            while (current != null) {
                path.push(current);
                current = current.left;
            }

            TreeNode node = path.pop();

            if (previousValue != null && node.val <= previousValue) {
                return false;
            }

            previousValue = (long) node.val;
            current = node.right;
        }

        return true;
        
    }
}
