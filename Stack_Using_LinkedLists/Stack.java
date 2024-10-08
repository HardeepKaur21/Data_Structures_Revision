import java.util.Scanner;

public class Stack {
    int n = 10;
    Node top;
    int a[] = new int[n];

    public void push(Scanner sc) {
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        Node new_node = new Node(data);
        if (top == null) {
            top = new_node;
        } else {
            new_node.next = top;
            top = new_node;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("The Stack is empty.");
        } else {
            top = top.next;
            System.out.println("The data has been deleted.");
        }
    }

    public void display() {
        Node temp = top;
        System.out.println("The data in the Stack are: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

}
