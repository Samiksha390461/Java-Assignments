class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int smaller = Math.min(p.val, q.val);
        int larger = Math.max(p.val, q.val);

        TreeNode current = root;

        while (current != null) {

            if (current.val > larger) {
                current = current.left;
                continue;
            }

            if (current.val < smaller) {
                current = current.right;
                continue;
            }

            return current;
        }

        return null;
        
    }
}
