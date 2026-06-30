public class Codec {
    private static final String EMPTY = "#";
    private static final String DELIM = ",";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder data = new StringBuilder();
        writeTree(root, data);
        return data.toString();
    }

    private void writeTree(TreeNode node, StringBuilder data) {

        if (node == null) {
            data.append(EMPTY).append(DELIM);
            return;
        }

        data.append(node.val).append(DELIM);

        writeTree(node.left, data);
        writeTree(node.right, data);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
         LinkedList<String> values =
                new LinkedList<>(Arrays.asList(data.split(DELIM)));

        return restore(values);
    }

    private TreeNode restore(LinkedList<String> values) {

        String current = values.removeFirst();

        if (current.equals(EMPTY)) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(current));

        node.left = restore(values);
        node.right = restore(values);

        return node;
        
    }
}
