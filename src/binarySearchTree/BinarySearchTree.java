package binarySearchTree;

public class BinarySearchTree {
    private BSTNode root;

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private BSTNode insertRecursive(BSTNode node, int data) {
        if (node == null) return new BSTNode(data);

        if (data < node.data) {
            node.left = insertRecursive(node.left, data);
        } else if (data > node.data) {
            node.right = insertRecursive(node.right, data);
        }

        return node;
    }

    public void inOrderTraversal() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(BSTNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }
}