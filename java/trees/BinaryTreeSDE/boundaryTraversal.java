package trees.BinaryTreeSDE;
import java.util.*;
public class boundaryTraversal {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    ArrayList<Integer> ans = new ArrayList<>();

    boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    void addLeftBoundary(Node root) {

        Node curr = root.left;

        while (curr != null) {

            if (!isLeaf(curr))
                ans.add(curr.data);

            if (curr.left != null)
                curr = curr.left;
            else
                curr = curr.right;
        }
    }

    void addLeaves(Node root) {

        if (root == null) return;

        if (isLeaf(root)) {
            ans.add(root.data);
            return;
        }

        addLeaves(root.left);
        addLeaves(root.right);
    }

    void addRightBoundary(Node root) {

        Stack<Integer> st = new Stack<>();

        Node curr = root.right;

        while (curr != null) {

            if (!isLeaf(curr))
                st.push(curr.data);

            if (curr.right != null)
                curr = curr.right;
            else
                curr = curr.left;
        }

        while (!st.isEmpty()) {
            ans.add(st.pop());
        }
    }
    ArrayList<Integer> boundaryTraversal(Node root) {

        if (root == null) return ans;

        if (!isLeaf(root))
            ans.add(root.data);

        addLeftBoundary(root);

        addLeaves(root);

        addRightBoundary(root);

        return ans;
    }
}
