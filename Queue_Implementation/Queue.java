public class Queue {
    int queue[] = new int[5];
    int front;
    int rear;
    int size;

    public void enQueue(int data) {
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear++) % 5; // this modulo us used to ensure that indices are recycled.
            size++;
        } else {
            System.out.println("The queue is full.");
        }
    }

    public void show() {
        System.out.print("The elements of the queue are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % 5] + " "); //debug
        }
        System.out.println();
    }

    public int deQueue() {
        int data = queue[front];
        if (!isEmpty()) {
            front = (front++) % 5;
            size--;
        } else {
            System.out.println("The queue is empty.");
        }
        return data;

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return (getSize() == 0);
    }

    public boolean isFull() {
        return (getSize() == 5);
    }
}
