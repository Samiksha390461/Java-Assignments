class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(p);
        s2.push(q);

        while (!s1.isEmpty()) {

            TreeNode a = s1.pop();
            TreeNode b = s2.pop();

            if (a == null && b == null) {
                continue;
            }

            if (a == null || b == null) {
                return false;
            }

            if (a.val != b.val) {
                return false;
            }

            s1.push(a.left);
            s1.push(a.right);

            s2.push(b.left);
            s2.push(b.right);
        }

        return true;
        
    }
}
