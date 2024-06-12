class Node {
    int data;
    Node right;
    Node left;

    public Node(int data) {
        this.data = data;
    }

}

public class BinaryTree {

    Node root;

    public void insert(int data) {
        root = recInsert(root, data);
    }

    private Node recInsert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = recInsert(root.left, data);
        } else if (data > root.data) {
            root.right = recInsert(root.right, data);
        }
        return root;
    }

    public void inorder() {
        recInorder(root);
    }

    private void recInorder(Node root) {
        if (root != null) {
            recInorder(root.left);
            System.out.print(root.data + " ");
            recInorder(root.right);
        }
    }

    public void preorder() {
        recPreorder(root);
    }

    private void recPreorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            recPreorder(root.left);
            recPreorder(root.right);
        }
    }

    public void postorder() {
        recPostorder(root);
    }

    private void recPostorder(Node root) {
        if (root != null) {
            recPostorder(root.left);
            recPostorder(root.right);
            System.out.print(root.data + " ");
        }
    }
}
