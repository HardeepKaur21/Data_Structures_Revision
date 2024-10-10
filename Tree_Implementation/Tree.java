import java.util.Scanner;

public class Tree {
    static Node create() {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        if (data == -1) {
            sc.close();
            return null;
        }
        root = new Node(data);
        System.out.println("Enter left child of " + root);
        root.left = create();

        System.out.println("Enter right child of " + root);
        root.right = create();
        sc.close();
        return root;

    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        inorder(root.left);
        inorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data + " ");

    }

}
