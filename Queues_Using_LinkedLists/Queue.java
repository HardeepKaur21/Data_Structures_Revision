import java.util.Scanner;

public class Queue {
    Node front = null;
    Node rear = null;
    int n = 10;

    int queue[] = new int[n];

    public void enqueue(Scanner sc) {

        System.out.println("Enter data: ");
        int data = sc.nextInt();
        Node new_node = new Node(data);
        if (front == null && rear == null) {
            front = new_node;
            rear = new_node;
        } else {
            rear.next = new_node;
            rear = new_node;
        }

    }

    public void dequeue() {
        if (front == null && rear == null) {
            System.out.println("The Queue is empty.");
        } else {
            front = front.next;
        }

    }

    public void display() {
        Node temp = front;
        System.out.println("The data in the Queue are: ");

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
