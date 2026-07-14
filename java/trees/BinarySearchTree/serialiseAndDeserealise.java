package trees.BinarySearchTree;

public class serialiseAndDeserealise {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
    }

    private void preorder(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#,");
            return;
        }

        sb.append(root.val).append(",");

        preorder(root.left, sb);
        preorder(root.right, sb);
    }


    // Decodes your encoded data to tree.
    int idx = 0;
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        idx = 0;
        return build(arr);
    }
    private TreeNode build(String[] arr) {

        if (arr[idx].equals("#")) {
            idx++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(arr[idx++]));

        root.left = build(arr);
        root.right = build(arr);

        return root;
    }
}
