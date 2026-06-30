class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> mirror = new LinkedList<>();

        mirror.offer(root.left);
        mirror.offer(root.right);

        while (!mirror.isEmpty()) {

            TreeNode leftNode = mirror.poll();
            TreeNode rightNode = mirror.poll();

            if (leftNode == null && rightNode == null) {
                continue;
            }

            if (leftNode == null || rightNode == null) {
                return false;
            }

            if (leftNode.val != rightNode.val) {
                return false;
            }

            mirror.offer(leftNode.left);
            mirror.offer(rightNode.right);

            mirror.offer(leftNode.right);
            mirror.offer(rightNode.left);
        }

        return true;
    }
        
}
