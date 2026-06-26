class Solution {

    public TreeNode searchBST(TreeNode root, int val) {

        TreeNode current = root;

        while (current != null) {

            if (current.val == val) {
                return current;
            }

            current = (val < current.val)
                    ? current.left
                    : current.right;
        }

        return null;
    }
}
