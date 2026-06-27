class Solution {
    public int maxPathSum(TreeNode root) {
        int[] best = {Integer.MIN_VALUE};
        calculateGain(root, best);
        return best[0];
    }

    private int calculateGain(TreeNode node, int[] best) {

        if (node == null) {
            return 0;
        }

        int left = Math.max(0, calculateGain(node.left, best));
        int right = Math.max(0, calculateGain(node.right, best));

        int throughNode = node.val + left + right;

        if (throughNode > best[0]) {
            best[0] = throughNode;
        }

        return node.val + Math.max(left, right);
        
    }
}
