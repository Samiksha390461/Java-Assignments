class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        ArrayDeque<TreeNode> nodes = new ArrayDeque<>();
        nodes.offer(root);

        int depth = 0;

        while (!nodes.isEmpty()) {

            int levelSize = nodes.size();
            depth++;

            while (levelSize-- > 0) {

                TreeNode current = nodes.poll();

                if (current.left != null) {
                    nodes.offer(current.left);
                }

                if (current.right != null) {
                    nodes.offer(current.right);
                }
            }
        }

        return depth;

        
    }
}
