class Solution {

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        ArrayDeque<TreeNode> pending = new ArrayDeque<>();
        pending.offer(root);

        while (!pending.isEmpty()) {

            TreeNode current = pending.poll();

            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;

            if (current.left != null) {
                pending.offer(current.left);
            }

            if (current.right != null) {
                pending.offer(current.right);
            }
        }

        return root;
    }
}
