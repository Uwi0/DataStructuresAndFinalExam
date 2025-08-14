package binarySearchTree;

public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] numbers = {10, 15, 21, 17, 19, 9, 23, 29, 4, 13};

        for (int num : numbers) {
            bst.insert(num);
        }

        System.out.println("In-Order Traversal:");
        bst.inOrderTraversal();
    }
}
