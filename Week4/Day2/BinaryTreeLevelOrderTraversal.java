class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int nodesInLevel = queue.size();
            List<Integer> currentLevel = new ArrayList<>(nodesInLevel);

            while (nodesInLevel-- > 0) {

                TreeNode current = queue.poll();
                currentLevel.add(current.val);

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            result.add(currentLevel);
        }

        return result;
        
    }
}
