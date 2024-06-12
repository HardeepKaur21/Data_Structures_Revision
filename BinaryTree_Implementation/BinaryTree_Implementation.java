public class BinaryTree_Implementation {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        System.out.println("Inorder Traverse: ");
        tree.inorder();

        System.out.println("\nPreorder Traverse: ");
        tree.preorder();

        System.out.println("\nPostorder Traverse: ");
        tree.postorder();
    }
}