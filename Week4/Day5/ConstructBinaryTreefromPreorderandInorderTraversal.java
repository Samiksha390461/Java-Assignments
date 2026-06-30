class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        HashMap<Integer, Integer> position = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            position.put(inorder[i], i);
        }

        return create(preorder, 0, inorder.length - 1, new int[]{0}, position);
    }

    private TreeNode create(int[] preorder,
                            int left,
                            int right,
                            int[] current,
                            HashMap<Integer, Integer> position) {

        if (left > right) {
            return null;
        }

        int value = preorder[current[0]++];
        TreeNode node = new TreeNode(value);

        int split = position.get(value);

        node.left = create(preorder, left, split - 1, current, position);
        node.right = create(preorder, split + 1, right, current, position);

        return node;
    }
}
