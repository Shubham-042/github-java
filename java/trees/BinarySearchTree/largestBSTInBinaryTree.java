package trees.BinarySearchTree;

public class largestBSTInBinaryTree {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static class NodeValue{
        int maxNode;
        int minNode;
        int maxSize;
        NodeValue(int maxNode,int minNode,int maxSize){
            this.maxNode=maxNode;
            this.minNode=minNode;
            this.maxSize=maxSize;
        }
    }
    public static NodeValue helper(Node root){
        if(root==null){
            return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        }
        NodeValue left=helper(root.left);
        NodeValue right=helper(root.right);

        if(left.maxNode<root.data && root.data< right.minNode){
            return new NodeValue(
                    Math.max(root.data, right.maxNode),   // maxNode
                    Math.min(root.data, left.minNode),    // minNode
                    left.maxSize + right.maxSize + 1
            );
        }

        return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,Math.max(left.maxSize,right.maxSize));

    }
    static int largestBst(Node root) {
        return helper(root).maxSize;
    }
}
