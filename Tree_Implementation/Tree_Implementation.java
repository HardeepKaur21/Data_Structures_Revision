
public class Tree_Implementation {
    public static void main(String[] args) {
        Node root = Tree.create();

        Tree.preorder(root);
        System.out.println();

        Tree.inorder(root);
        System.out.println();

        Tree.postorder(root);
    }
}