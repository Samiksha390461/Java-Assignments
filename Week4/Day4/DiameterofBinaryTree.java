class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] longest = new int[1];
        findHeight(root, longest);
        return longest[0];
    }

    private int findHeight(TreeNode node, int[] longest) {

        if (node == null) {
            return 0;
        }

        int leftDepth = findHeight(node.left, longest);
        int rightDepth = findHeight(node.right, longest);

        int currentPath = leftDepth + rightDepth;

        if (currentPath > longest[0]) {
            longest[0] = currentPath;
        }

        return Math.max(leftDepth, rightDepth) + 1;

        
    }
}
