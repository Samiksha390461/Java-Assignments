class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        ArrayDeque<TreeNode> path = new ArrayDeque<>();

        TreeNode current = root;

        while (current != null || !path.isEmpty()) {

            while (current != null) {
                path.push(current);
                current = current.left;
            }

            TreeNode visited = path.pop();
            answer.add(visited.val);

            current = visited.right;
        }

        return answer;
        
    }
}
