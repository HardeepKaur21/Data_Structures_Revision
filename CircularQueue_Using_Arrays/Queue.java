import java.util.Scanner;

public class Queue {
    int front = -1;
    int rear = -1;
    int n = 10;

    int queue[] = new int[n];

    public void enqueue(Scanner sc) {
        if (front == (rear + 1) % n) {
            System.out.println("The Queue is full.");
        } else {
            System.out.println("Enter data: ");
            int data = sc.nextInt();
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
                queue[rear] = data;
            } else {
                rear = (rear + 1) % n;
                queue[rear] = data;
            }

        }
    }

    public void dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("The Queue is empty.");
        } else if (front == rear) {
            System.out.println("The Queue is empty.");
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % n;
        }

    }

    public void display() {
        int i;
        System.out.println("The data in the Queue are: ");
        for (i = front; i != rear; i = (i + 1) % n) {
            System.out.println(queue[i] + " ");
        }
        System.out.println(queue[i]);
    }
}
